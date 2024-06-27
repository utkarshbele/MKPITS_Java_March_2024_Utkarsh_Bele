use sakila;
#1. Find customers who rented a specific film:
#Retrieve the names of customers who rented the film with the title 'Indian Love'.
select  c.first_name, c.last_name from customer c where c.customer_id in 
(select r.customer_id from rental r where r.inventory_id in ( select i.inventory_id
from inventory i where i.film_id = (select f.film_id from film f where f.title = 'indian love')));

#2. Find films rented by a specific customer:
#Retrieve the titles of films rented by a customer with a given customer_id.
select f.title from film f where f.film_id in (select i.film_id from inventory i where i.inventory_id in (select r.inventory_id from 
rental r where r.customer_id = (select c.customer_id from customer c where c.customer_id=250)));

#3. Find rental details for the most recent rental:
#Retrieve the rental details for the most recent rental transaction in the database.
select rental_id, rental_date, inventory_id, customer_id, return_date, staff_id
from rental where rental_date = (select max(rental_date) from rental);

#4. Find the average rental duration compared to the overall average:
#Compare the average rental duration of films in a specific category with the overall average rental duration.
select(select avg(rental_duration) from film) as 'overall_avg' ,(
select avg(f.rental_duration) as avg_rental_duration
from rental r join inventory i on r.inventory_id = i.inventory_id join film f on i.film_id = f.film_id
join film_category fc on f.film_id = fc.film_id join category c on fc.category_id = c.category_id
where c.name = 'Music') as 'category_based_average';
#or
select cat.category_id,cat.name,AVG(f.rental_duration) as average, IF(avg(f.rental_duration)>
(select avg(rental_duration) from film), "MORE", "LESS") as comparison_with_other from category cat join
film_category fc on cat.category_id=fc.category_id join
 film f on fc.film_id=f.film_id group by cat.category_id,cat.name;

#5. Find films with rental counts above average:
#Retrieve films with rental counts greater than the average number of rentals across all films.
#- Count film wise rental
#- Display films whose rental count is > avg rental count
select film_id, title, rental_count from (select f.film_id, f.title, count(r.rental_id) as rental_count from film f
join inventory i on f.film_id = i.film_id join rental r on i.inventory_id = r.inventory_id group by film_id, f.title) as film_rental_count
where rental_count>(select avg(film_rental_count.rental_count)from (select count(r.rental_id) as rental_count from film f 
join inventory i on f.film_id = i.film_id join rental r on i.inventory_id = r.inventory_id group by f.film_id) as film_rental_counts);

#6. Find customers who rented the same film as another customer:
#Identify customers who rented the same film as a specific customer (based on customer_id).
select c.customer_id, c.first_name, c.last_name from customer c join rental r on r.customer_id=c.customer_id join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where f.film_id in(
select f.film_id from customer c join rental r on r.customer_id=c.customer_id join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.customer_id= 4);

#7. Find customers who have rented from both stores:
#Identify customers who have rented films from both store_id 1 and store_id 2.
select distinct c.customer_id, c.first_name, c.last_name from customer c join rental r on r.customer_id=c.customer_id join
inventory i on i.inventory_id=r.inventory_id join store s on s.store_id=i.store_id where s.store_id=1 and c.customer_id in
(select c.customer_id from customer c join rental r on r.customer_id=c.customer_id join inventory i on i.inventory_id=r.inventory_id 
join store s on s.store_id=i.store_id where s.store_id=2);

#8. Find actors who have appeared in the same film:
#Retrieve actors who have appeared in the same film as a specific actor (based on actor_id).  
select a.actor_id, a.first_name,a.last_name,f.title as actor_in_film from actor a  join
film_actor fa on a.actor_id=fa.actor_id join
film f on fa.film_id=f.film_id where f.title= any
(select f.title from film f join
film_actor fa on f.film_id=fa.film_id  join
actor a on fa.actor_id=a.actor_id where a.actor_id=4);

#9. Find films rented by top-revenue customers:
#Retrieve film titles rented by customers who are among the top 10 in terms of total rental revenue.
-- Retrieve film titles rented by customers who are among the top 10 in terms of total rental revenue
SELECT DISTINCT f.title FROM rental r JOIN inventory i ON r.inventory_id = i.inventory_id JOIN film f ON i.film_id = f.film_id
WHERE r.customer_id IN ( SELECT customer_id FROM (SELECT c.customer_id, SUM(p.amount) AS total_revenue FROM customer c
JOIN rental r ON c.customer_id = r.customer_id JOIN payment p ON r.rental_id = p.rental_id GROUP BY c.customer_id ORDER BY total_revenue DESC
LIMIT 10) AS top_customers);

#10. Find films that have not been rented:
#Retrieve titles of films that have not been rented by any customer.
SELECT f.title FROM film f LEFT JOIN inventory i ON f.film_id = i.film_id LEFT JOIN rental r ON i.inventory_id = r.inventory_id
WHERE r.rental_id IS NULL;
