use sakila;
#1.Retrieve the names of all customers and the titles of the films they have rented.
select c.first_name, c.last_name, f.title 
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id;

#2. Display the rental date and return date for each rental along with the customer first name and last name.
select r.rental_date,r.return_date, c.first_name, c.last_name from rental r join customer c on r.customer_id=c.customer_id;

#3. List the names of actors who have appeared in the film titled Chamber Italian
select a.first_name,a.last_name from actor a join film_actor fa on a.actor_id=fa.actor_id 
join film f on fa.film_id=f.film_id where f.title='Chamber Italian';

#4. Get the titles of all films rented by the customer named Elizabeth Brown.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name='Elizabeth' and c.last_name='Brown';

#5. Retrieve the film titles rented by the customer with customer_id 100.
select f.title,c.customer_id from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=100;

#6. List the film titles and rental dates for all rentals made by the customer with customer_id 200.
select f.title, r.rental_date,c.customer_id from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=200;

#7. Display the film titles and rental durations for all rentals made on May 15,2005.
select f.title, datediff(r.return_date,r.rental_date) as 'Rental Duration' from film f join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.last_update)='2005-05-24';
select * from rental;

#8. List the names of customers who have rented the film titled Alien Center;
select c.first_name, c.last_name 
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where f.title='Alien Center';

#9. Display the first name, last name, and email of customers who have rented the film titled Flight Lies
select c.first_name, c.last_name, c.email, f.title 
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where f.title='Flight Lies';

#10. Retrieve the rental date and rental duration for each rental made by customer Linda Williams
select r.rental_date, f.rental_duration from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.first_name='Linda' and c.last_name='Williams';

#11. List the film titles and rental dates for all rentals made by customer Mary Smith.
select f.title, r.rental_date,c.customer_id from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name='Mary' and c.last_name='Smith';
select * from customer;

#12. Display the film titles rented by the customer with customer_id 300.
select c.customer_id, f.title 
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.customer_id=300;

#13. Get the names of all customers who have rented more than 5 films.
SELECT c.first_name, c.last_name FROM customer c JOIN rental r ON r.customer_id = c.customer_id
JOIN inventory i ON i.inventory_id = r.inventory_id JOIN film f ON f.film_id = i.film_id
GROUP BY c.customer_id, c.first_name, c.last_name HAVING COUNT(f.film_id) > 5;

#14. List the film titles and rental dates for all rentals made by the customer with customer_id 400.
select f.title, r.rental_date, c.customer_id
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.customer_id=400;

#15. Retrieve the rental date and return date for each rental made by customer Richard Mccrary.
select r.rental_date, r.return_date
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.first_name='Richard' and c.last_name='Mccrary';

#16. Display the first name, last name, and email of customers who have rented the film titled Dinosaur Secretary
select c.first_name, c.last_name, c.email
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where f.title="Dinosaur Secretary";

#17. List the names of customers who have rented the film titled Silence Kane
select c.first_name, c.last_name from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where f.title="Silence Kane";

#18. Get the film titles and rental dates for all rentals made on August 10,2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.rental_date)='2005-08-10';

#19. Retrieve the film titles rented by the customer with customer_id 500.
select f.title, c.customer_id
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.customer_id=500;

#20. Display the rental date and rental duration for each rental made by customer Karen Jackson
select r.rental_date, f.rental_duration
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.first_name='Karen' and c.last_name='Jackson';

#21. List the film titles and rental dates for all rentals made by customer Steven Taylor
select f.title, r.rental_date
from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.first_name='Steven' and c.last_name='Curley';

#22. Display the names of customers who have rented the film titled Ocean Luke.
select c.first_name, c.last_name from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where f.title="Ocean Luke";

#23. Get the first name, last name, and email of customers who have rented more than 10 films.
SELECT c.first_name, c.last_name, c.email FROM customer c JOIN rental r ON r.customer_id = c.customer_id
JOIN inventory i ON i.inventory_id = r.inventory_id JOIN film f ON f.film_id = i.film_id
GROUP BY c.customer_id HAVING COUNT(f.film_id) > 10;

#24. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 550.
select f.title,r.rental_date, c.customer_id from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.customer_id=550;

#25. List the rental date and return date for all rentals made by customer Susan Johnson
select r.rental_date, r.return_date from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id where c.first_name='Susan' and c.last_name='Wilson';
