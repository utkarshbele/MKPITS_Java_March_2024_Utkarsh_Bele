#26. Display the film titles rented by the customer with customer_id 599.
select f.title, c.customer_id from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=599;

#27. Get the names of customers who have rented the film titled Murder Antitrust
select c.first_name, c.last_name  from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id where f.title='Murder Antitrust';

#28. Retrieve the rental date and rental duration for each rental made by customer Joseph Joy
select r.rental_date, f.rental_duration from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Joseph" and c.last_name="Joy";

#29. List the film titles and rental dates for all rentals made by customer Michael Silverman
select f.title, r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Michael" and c.last_name="Silverman";

#30. Display the first name, last name, and email of customers who have rented the film titled Squad Fish
select c.first_name, c.last_name, c.email from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id where f.title='Squad Fish';

#31. Get the film titles and rental dates for all rentals made on July 25, 2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.rental_date)='2005-07-25';

#32. Retrieve the film titles rented by the customer with customer_id 400.
select f.title, c.customer_id from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=400;

#33. List the rental date and return date for all rentals made by customer Barbara Jones
select f.title, r.rental_date,r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Barbara" and c.last_name="Jones";

#34. Display the names of customers who have rented the film titled Zorro Ark.
select c.first_name, c.last_name from customer c join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id where f.title='Zorro Ark';

#35. Get the first name, last name, and email of customers who have rented more than 8 films.
select c.first_name,c.last_name, c.email from customer c join rental r on r.customer_id=c.customer_id 
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id 
group by c.first_name,c.last_name, c.email having count(distinct(f.film_id))>8;

#36. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 366.
select f.title, r.rental_date, c.customer_id from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=366;

#37. List the rental date and rental duration for each rental made by customer Helen Harris
select r.rental_date,f.rental_duration from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Helen" and c.last_name="Harris";

#38. Display the film titles rented by the customer with customer_id 428.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=428;

#39. Get the names of customers who have rented the film titled Carol Texas
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Carol Texas';

#40. Retrieve the rental date and return date for each rental made by customer Lisa Anderson.
select r.rental_date,r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Lisa" and c.last_name="Anderson";

#41. List the film titles and rental dates for all rentals made by customer Matthew Smith
select f.title, r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Matthew" and c.last_name="Mahan";

#42. Display the first name, last name, and email of customers who have rented the film titled Innocent Usual
select c.customer_id, c.first_name, c.last_name, c.email from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Innocent Usual';

#43. Get the film titles and rental dates for all rentals made on June 18, 2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.rental_date)='2005-06-18';

#44. Retrieve the film titles rented by the customer with customer_id 100.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=100;

#45. List the rental date and return date for all rentals made by customer Jennifer Lee
select f.title, r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Jennifer" and c.last_name="Lee";

#46. Display the names of customers who have rented the film titled Inferno Kilometer
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Indian Love';

#47. Get the first name, last name, and email of customers who have rented more than 12 films.
select c.first_name,c.last_name,c.email from customer c join rental r on c.customer_id=r.customer_id 
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id group by c.customer_id having count(f.title)>12;

#48. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 120.
select f.title, r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=120;

#49. List the rental date and rental duration for each rental made by customer David Royal
select f.title, r.rental_date, f.rental_duration from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="David" and c.last_name="Royal";

#50. Display the film titles rented by the customer with customer_id 130.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=130;