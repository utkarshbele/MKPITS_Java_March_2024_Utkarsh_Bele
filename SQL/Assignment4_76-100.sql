use sakila;
#76. Retrieve the rental date and return date for each rental made by customer George Linton.
select r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="George" and c.last_name="Linton";

#77. List the film titles and rental dates for all rentals made by customer Lisa Anderson
select r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Lisa" and c.last_name="Anderson";

#78. Display the first name, last name, and email of customers who have rented the film titled Doom Dancing
select c.customer_id, c.first_name, c.last_name, c.email from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Doom Dancing';

#79. Get the film titles and rental dates for all rentals made on December 12,2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.rental_date)='2005-12-12';

#80. Retrieve the film titles rented by the customer with customer_id 200.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=200;

#81. List the rental date and return date for all rentals made by customer Kevin Johnson
select r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Kevin" and c.last_name="Schuler";

#82. Display the names of customers who have rented the film titled Firehouse Vietnam
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Firehouse Vietnam';

#83. Get the first name, last name, and email of customers who have rented more than 20 films.
select c.first_name,c.last_name,c.email from customer c join rental r on c.customer_id=r.customer_id 
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id group by c.customer_id having count(f.title)>20;

#84. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 210.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=210;

#85. List the rental date and rental duration for each rental made by customer Nancy Thomas
select r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Nancy" and c.last_name="Thomas";

#86. Display the film titles rented by the customer with customer_id 220.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=220;

#87. Get the names of customers who have rented the film titled Gang Related
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Gang Pride';

#88. Retrieve the rental date and return date for each rental made by customer Thomas Johnson
select r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Thomas" and c.last_name="Grigsby";

#89. List the film titles and rental dates for all rentals made by customer Sarah Harris
select r.rental_date, f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Sarah" and c.last_name="Lewis";

#90. Display the first name, last name, and email of customers who have rented the film titled Frankenstein Stranger
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title=' Grail Frankenstein';

#91. Get the film titles and rental dates for all rentals made on November 8,2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.rental_date)='2005-11-08';

#92. Retrieve the film titles rented by the customer with customer_id 230.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=230;

#93. List the rental date and return date for all rentals made by customer Dororthy Taylor
select r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Dorothy" and c.last_name="Taylor";

#94. Display the names of customers who have rented the film titled Intrigue Worst
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Intrigue Worst';

#95. Get the first name, last name, and email of customers who have rented more than 22 films.
select c.first_name,c.last_name,c.email from customer c join rental r on c.customer_id=r.customer_id 
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id group by c.customer_id having count(f.title)>22;

#96. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 240.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=240;

#97. List the rental date and rental duration for each rental made by customer James Clark
select r.rental_date, f.rental_duration from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="James" and c.last_name="Gannon";

#98. Display the film titles rented by the customer with customer_id 250.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=250;

#99. Get the names of customers who have rented the film titled Gang Pride
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Gang Pride';

#100. Retrieve the rental date and return date for each rental made by customer Michelle Clark
select r.rental_date, f.rental_duration from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Michelle" and c.last_name="Clark";