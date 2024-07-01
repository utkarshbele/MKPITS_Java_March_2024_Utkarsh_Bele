#1. **Retrieve Actor Information by Last Name**:
 #  Write a procedure that accepts an actor's last name as input and returns a list of all actors with that last name, 
 #including their first name, last name, and actor ID.
DELIMITER $$
CREATE PROCEDURE actinfo(in ln char(10), out fn char(20))
BEGIN
  select first_name,last_name from actor where last_name=ln;
END $$
DELIMITER ; 
call actinfo('Chase',@fn);

#2. **List Films by Category**:
 #  Create a procedure that takes a category name as input and returns all films in that category, 
 #including film title, description, release year, and rating.
DELIMITER $$
CREATE PROCEDURE cat(in cn char(10), out fn char(20))
BEGIN
  select f.film_id, f.title,f.description,f.release_year,f.rating,cat.name from film f join film_category fc on fc.film_id=f.film_id
  join category cat on cat.category_id=fc.category_id where cat.name=cn;
END $$
DELIMITER ; 
call cat('Action',@fn);

#3. **Calculate Total Payment by Customer**:
#   Develop a procedure that accepts a customer ID and returns the total amount paid by that customer. 
#The result should include the customer ID, first name, last name, and total payment amount.
DELIMITER $$
CREATE PROCEDURE pay(in id char(10), out amt varchar(70))
BEGIN
  select c.customer_id,c.first_name,c.last_name,sum(p.amount) as 'Total Amount' from customer c 
  join payment p on c.customer_id=p.customer_id where c.customer_id=id  group by c.customer_id;
END $$
DELIMITER ; 
call pay(5,@amt);
drop procedure rent;

#4. **Count Rentals by Date Range**:
 #  Implement a procedure that accepts a start date and an end date and returns the number of rentals made within that date range. 
 #Include the rental ID and rental date in the results.
DELIMITER $$
CREATE PROCEDURE rent(in dt date,in dt1 date)
BEGIN
  select rental_id, rental_date, return_date from rental where rental_date between dt and dt1;
END $$
DELIMITER ; 
call rent('2005-05-24','2005-06-02');

#5. **Update Film Rental Rate**:
#Write a procedure to update the rental rate of a specific film. The procedure should accept the film ID 
#and the new rental rate as inputs and then update the rental rate for that film in the database. 
#Return the film ID, old rental rate, and new rental rate as output.
DELIMITER $$
CREATE PROCEDURE updt(in id char(10),in rrt char(10), out updt char(20))
BEGIN
  select film_id, rental_rate, rental_rate+rrt as "New_Rental_Rate" from film where film_id=id;
END $$
DELIMITER ; 
call updt(5,10,@updt);
select * from rental group by rental_id;