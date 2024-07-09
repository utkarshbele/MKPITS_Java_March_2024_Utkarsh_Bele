#1. #**Calculate Late Fees for a Rental**:
   #Write a function that accepts a rental ID and calculates the total late fees incurred for that rental. 
   #The function should return the total late fee amount based on the difference between the return date and the due date.
DELIMITER $$
CREATE FUNCTION calculate_late_fee(rental_id INT) 
RETURNS DECIMAL(10, 2)
BEGIN
    DECLARE due_date DATE;
    DECLARE return_date DATE;
    DECLARE late_days INT;
    DECLARE late_fee DECIMAL(10, 2);
    DECLARE fee_per_day DECIMAL(10, 2) DEFAULT 2.00; -- assuming late fee is 2.00 per day

    -- Fetch due date and return date for the given rental ID
    SELECT r.rental_date + INTERVAL f.rental_duration DAY INTO due_date
    FROM rental r
    JOIN inventory i ON r.inventory_id = i.inventory_id
    JOIN film f ON i.film_id = f.film_id
    WHERE r.rental_id = rental_id;

    SELECT return_date INTO return_date
    FROM rental
    WHERE rental_id = rental_id;

    -- Check if the rental has been returned, otherwise set return_date to the current date
    IF return_date IS NULL THEN
        SET return_date = CURDATE();
    END IF;

    -- Calculate the number of late days
    SET late_days = DATEDIFF(return_date, due_date);

    -- If late_days is negative, there is no late fee
    IF late_days < 0 THEN
        SET late_days = 0;
    END IF;

    -- Calculate the total late fee
    SET late_fee = late_days * fee_per_day;

    RETURN late_fee;
END$$

DELIMITER ;

#2. #**Get Film Rating by Title**:
   #Create a function that takes a film title as input and returns the film's rating. 
   #The function should search for the film by title and return its rating (e.g., G, PG, PG-13, R, NC-17).
DELIMITER $$
CREATE FUNCTION get_film_rating(ftitle varchar(270))
RETURNS varchar(10)
DETERMINISTIC
BEGIN
declare film_rating varchar(10);
select rating into film_rating from film where title=ftitle limit 1;
RETURN (film_rating);
END $$
DELIMITER ;

select get_film_rating("ACE GOLDFINGER");

#3. **Count Films by Language**:
   #Develop a function that accepts a language name and returns the number of films available in that language. 
   #The function should query the films and languages tables to provide the count.
DELIMITER $$
CREATE FUNCTION get_flanguage(lname varchar(20))
RETURNS int
DETERMINISTIC
BEGIN
declare flanguage int;
select count(f.film_id) into flanguage from language l join film f on f.language_id=l.language_id where l.name=lname;
RETURN (flanguage);
END $$
DELIMITER ;

select get_flanguage("english");

#4. #**Check Film Availability**:
   #Implement a function that takes a film ID as input and returns a Boolean value indicating whether the film is currently available for rent. 
   #The function should check the inventory and rental tables to determine availability.
DELIMITER $$
CREATE FUNCTION get_film(fid int)
RETURNS boolean
DETERMINISTIC
BEGIN
declare filmcount int;
select count(i.inventory_id) into filmcount from inventory i left join rental r on i.inventory_id=r.inventory_id 
where i.film_id=fid and r.rental_id= null ;
RETURN (filmcount>0);
END $$
DELIMITER ;

select get_film(2); 

#5. #**Get Customer Rental History**:
   #Write a function that accepts a customer ID and returns the total number of rentals made by that customer. 
   #The function should aggregate the rentals based on the provided customer ID and return the count.
DELIMITER $$
CREATE FUNCTION get_cRental(cid int)
RETURNS int
DETERMINISTIC
BEGIN
declare rentalcount int;
select count(rental_id) into rentalcount from rental where customer_id=cid  ;
RETURN (rentalcount);
END $$
DELIMITER ;

select get_cRental(5);