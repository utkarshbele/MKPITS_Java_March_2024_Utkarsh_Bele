use sakila;
#Find the total number of films in the database.
select count(*) from film;
#Find the average rental rate of all films.
select avg(rental_rate) from film;
#Find the total number of rentals made.
select count(rental_id) from  rental;
#Find the highest replacement cost of any film.
select max(replacement_cost) from film;
#Find the total revenue generated from rentals
select sum(amount) from payment;
#Find the average length of films.
select avg(length) from film;
#Find the minimum rental duration among all films
select min(rental_duration) from film; 
#Find the total number of distinct customer IDs in the rental table
select count(distinct customer_id) from customer;
#Find the average payment amount made by customers.
select avg(amount) from payment;
#Find the total number of inventory items available
select count(*) from inventory;
#Find the total number of distinct films rented.
select count(distinct film_id) from film;
#Find the highest payment amount made by any customer
select max(amount) from payment; 
#Find the average length of films that have a rating of 'PG'
select avg(length) from film where rating='PG';
#Find the total number of payments made in May 2005
select count(payment_id) from payment where payment_date between'2005/05/01' and '2005/05/31';
#Find the total number of films with a rental duration of 7 days
select count(film_id) from film where rental_duration=7;
#Find the average replacement cost of films with a rental rate of 2.99
select avg(replacement_cost) from film where rental_rate=2.99;