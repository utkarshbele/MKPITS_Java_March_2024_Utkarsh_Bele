#1. **Inventory Stock Alert**:
 #  - **Problem Statement**: Whenever a new rental is created, check the inventory quantity for the rented film. 
 #  If the quantity falls below a certain threshold (e.g., 5 copies), log a warning message in a `low_stock_alerts` table.
 #  - **Trigger Description**: Create an `AFTER INSERT` trigger on the `rental` table that updates the inventory count for the rented film 
 #  and inserts a row into the `low_stock_alerts` table if the count is below the threshold.
DELIMITER $$
CREATE TRIGGER after_rental_insert
AFTER INSERT ON rental
FOR EACH ROW
BEGIN
    DECLARE available_count INT;
    declare stock_threshold int default 5;
 
    update inventory i join film f on i.film_id = f.film_id
    set i.quantity = i.quantity - 1
    where i.inventory_id = new.inventory_id;

    select i.quantity into available_count from inventory i join rental r on i.inventory_id = r.inventory_id where r.rental_id = new.rental_id;
    
    if available_count < stock_threshold then insert into low_stock_alerts (film_id, alert_date)
        values ((select f.film_id from inventory i join film f on i.film_id = f.film_id where i.inventory_id = new.inventory_id), now());
    end if;
END $$
DELIMITER ;


#2. **Prevent Deletion of Active Customers**:
#   - **Problem Statement**: Prevent the deletion of a customer who has any active rentals.
#   - **Trigger Description**: Create a `BEFORE DELETE` trigger on the `customer` table that checks for active rentals.
#   If active rentals exist, raise an error and prevent the deletion.
DELIMITER $$
CREATE TRIGGER before_customer_delete
BEFORE DELETE ON customer
FOR EACH ROW
BEGIN
    DECLARE active_rentals_count INT;

    select COUNT(*) into active_rentals_count from rental where customer_id = old.customer_id and return_date=null;

    if active_rentals_count > 0 then
        signal sqlstate '45000'
        set message_text = 'Customer has active rentals and cannot be deleted';
    END IF;
END $$
DELIMITER ;

#3. **Update Last Updated Timestamp**:
#   - **Problem Statement**: Automatically update the `last_update` timestamp column in the `film` table whenever a film's details are modified.
#   - **Trigger Description**: Create a `BEFORE UPDATE` trigger on the `film` table that sets the `last_update` column to the current timestamp.
DELIMITER $$
CREATE TRIGGER before_film_update
BEFORE UPDATE ON film
FOR EACH ROW
BEGIN
    set new.last_update = current_timestamp();
END $$
DELIMITER ;
update film set title="Random movie name" where film_id=4;

#4. **Log Film Deletion**:
#   - **Problem Statement**: Log details of any film deletions into a `deleted_films_log` table for auditing purposes.
#   - **Trigger Description**: Create an `AFTER DELETE` trigger on the `film` table that inserts the deleted film's details
#   into the `deleted_films_log` table.
DELIMITER $$
CREATE TRIGGER after_film_delete
AFTER DELETE ON film
FOR EACH ROW
BEGIN
    insert into deleted_films_log (
        film_id,
        title,
        description,
        release_year,
        language_id,
        original_language_id,
        rental_duration,
        rental_rate,
        length,
        replacement_cost,
        rating,
        special_features,
        last_update
    ) VALUES (
        old.film_id,
        old.title,
        old.description,
        old.release_year,
        old.language_id,
        old.original_language_id,
        old.rental_duration,
        old.rental_rate,
        old.length,
        old.replacement_cost,
        old.rating,
        old.special_features,
        old.last_update
    );
END $$
DELIMITER ;

create table deleted_films_log (
    film_id int,
    title varchar(300),
    description text,
    release_year year,
    language_id int,
    original_language_id int,
    rental_duration int,
    rental_rate decimal(4,2),
    length int,
    replacement_cost decimal(5,2),
    rating varchar(10),
    special_features text,
    last_update timestamp,
    deleted_at timestamp default current_timestamp
);

#5. **Ensure Valid Rental Dates**:
#   - **Problem Statement**: Ensure that the `return_date` in the `rental` table is always after the `rental_date`.
#   - **Trigger Description**: Create a `BEFORE INSERT` or `BEFORE UPDATE` trigger on the `rental` table that checks if the `return_date` is after 
#     the `rental_date`. If not, raise an error
DELIMITER $$
CREATE TRIGGER before_rental_insert
BEFORE INSERT ON rental
FOR EACH ROW
BEGIN
    if new.return_date is not null and new.return_date <= new.rental_date then
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Return date must be after Rental date';
    end if;
END $$
DELIMITER ;
