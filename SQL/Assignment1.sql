#Retrieve all films with a rental duration of more than 5 days:
use sakila;
select * from film where rental_duration>5;
#List all customers who live in the city of 'San Diego'
select * from customer where city='San Diago';
#Find all films with a rating of 'PG-13' and sort them by title:
select * from film where rating='PG-13' order by title;
#Display all actors whose last name starts with 'A' and order by first name
select * from actor where first_name like 'A%' order by first_name;
#Retrieve all films released in the year 2006
select * from film where release_year=2006;
#Find all customers whose first name is 'John' and sort by last name in descending order
select * from customer where first_name='John' order by last_name desc;
#List all films with a rental rate between 2.99 and 4.99, inclusive:
select * from film where rental_rate between 2.99 and 4.99; 
#Retrieve all actors with a last name containing 'son' and order by last name
select * from actor where last_name='son' order by last_name;
#Find all stores in city 'Los Angeles' and sort by store ID:
select * from store where city='Los Angeles' order by store_id;
#Display all films with a replacement cost greater than 20 and sort by replacement cost in ascending order:
select * from film where replacement_cost>20 order by replacement_cost;
#List all films with a length greater than 120 minutes:
select * from film where length>120;
#Find all customers who have an active status (status = 1):
select * from customer where active=1;
#Retrieve all films with a rental rate of 0.99 and sort them by length in descending order:
select * from film where rental_rate=0.99 order by length desc;
#Display all actors with a first name containing 'Tom' and order by last name:
select * from actor where first_name like '%Tom%' order by last_name;
#Find all films with a replacement cost less than 15 and sort them by title:
select * from film where replacement_cost<15 order by title;
#List all customers with a last name ending with 'son':
select * from customer where last_name like'%son';
#Retrieve all films with a rating of 'R' and sort them by rental duration:
 select * from film where rating='R' order by rental_duration;
 #Find all actors with a last name exactly equal to 'Smith' and order by first name:
 select * from actor where last_name='Smith' order by first_name;
 #Display all films with a rental duration of exactly 7 days and sort by replacement cost:
select * from film where rental_duration=7 order by replacement_cost;
#List all customers with a first name starting with 'A' and order by last name in ascending order:
select * from customer where first_name like 'A%' order by last_name;
#Retrieve all films with a rental duration between 3 and 7 days and a rental rate greater than 2.99:
select * from film where rental_duration between 3 and 7 and rental_rate>2.99; 
#List all customers who live in 'New York' or 'Los Angeles':
select * from customer where address_id in(select city_id from address where city_id in 
	(select city_id from city where city='Compton' or city='Abu Dhabi'));
#Find all films with a rating of 'PG' or 'G' and a length less than 90 minutes:
select * from film where (rating='PG' or rating='G') and length<90;
#Display all actors with a first name containing 'Sam' or a last name starting with 'B':
select * from actor where first_name like '%Sam%' or last_name like 'B%';
#Retrieve all films with a replacement cost between 15 and 25 and sort them by title:
select * from film where replacement_cost between 15 and 25 order by title;
#Find all customers who have rented a film in the last month and have an active status (status = 1):
select * from customer where active = 1
and customer_id in (
    select customer_id
    from rental
    where rental_date >= date_sub("2024-06-10", interval 1 day));
select * from rental;
#List all films with a rental rate of 4.99, 3.99, or 2.99:
select * from film where rental_rate in(4.99, 3.99, 2.99);
#Retrieve all actors with a first name starting with 'M' and a last name ending with 'y':
select * from actor where first_name like 'M%' and last_name like'%y';
#Find all films released in the years 2005, 2006, or 2007 and sort them by release year:**
select * from film where release_year in (2005, 2006, 2007) order by release_year;
#Display all customers with a first name of 'Emily' or a last name containing 'Lee':**
select * from customer where first_name='Emily' or last_name like '%Lee%';