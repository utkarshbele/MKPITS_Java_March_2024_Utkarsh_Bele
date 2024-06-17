use sakila;
#51. Get the names of customers who have rented the film titled Golden Groove
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Perfect Groove';

#52. Retrieve the rental date and return date for each rental made by customer Laura Rodriguez
select f.title, r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Laura" and c.last_name="Rodriguez";

#53. List the film titles and rental dates for all rentals made by customer John Farnsworth
select f.title, r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="John" and c.last_name="Farnsworth";

#54. Display the first name, last name, and email of customers who have rented the film titled SPICE SORORITY
select c.customer_id, c.first_name, c.last_name, c.email from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Spice SORORITY';

#55. Get the film titles and rental dates for all rentals made on September 24,2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.rental_date)='2005-05-24';

#56. Retrieve the film titles rented by the customer with customer_id 410.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=410;

#57. List the rental date and return date for all rentals made by customer Sarah Lewis
select r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Sarah" and c.last_name="Lewis";

#58. Display the names of customers who have rented the film titled Braveheart Human
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Braveheart Human';

#59. Get the first name, last name, and email of customers who have rented more than 15 films.
select c.first_name,c.last_name,c.email from customer c join rental r on c.customer_id=r.customer_id 
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id group by c.customer_id having count(f.title)>15;

#60. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 150.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=150;

#61. List the rental date and rental duration for each rental made by customer Paul Trout
select r.rental_date, f.rental_duration from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Paul" and c.last_name="Trout";

#62. Display the film titles rented by the customer with customer_id 160.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=160;

#63. Get the names of customers who have rented the film titled Princess Giant
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Princess Giant';

#64. Retrieve the rental date and return date for each rental made by customer Wendy Harris
select r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Wendy" and c.last_name="Harris";

#65. List the film titles and rental dates for all rentals made by customer Robert BAUGHMAN
select f.title, r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Robert" and c.last_name="BAUGHMAN";

#66. Display the first name, last name, and email of customers who have rented the film titled MATRIX SNOWMAN
select c.customer_id, c.first_name, c.last_name, c.email from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='MATRIX SNOWMAN';

#67. Get the film titles and rental dates for all rentals made on October 20,2005.
select f.title,r.rental_date from film f join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id where date(r.rental_date)='2005-10-20';

#68. Retrieve the film titles rented by the customer with customer_id 170.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=170;

#69. List the rental date and return date for all rentals made by customer Donald Davis
select f.title, r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Donald" and c.last_name="Davis";

#70. Display the names of customers who have rented the film titled CHAINSAW UPTOWN
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='CHAINSAW UPTOWN';

select * from film;
#71. Get the first name, last name, and email of customers who have rented more than 18 films.
select c.first_name,c.last_name,c.email from customer c join rental r on c.customer_id=r.customer_id 
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id group by c.customer_id having count(f.title)>18;

#72. Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 180.
select f.title, r.rental_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=180;

#73. List the rental date and rental duration for each rental made by customer Amy Lopez
select f.title, r.rental_date, r.return_date from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.first_name="Amy" and c.last_name="Lopez";

#74. Display the film titles rented by the customer with customer_id 190.
select f.title from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where c.customer_id=190;

#75. Get the names of customers who have rented the film titled Antitrust Tomatoes
select c.customer_id, c.first_name, c.last_name from film f join inventory i on f.film_id=i.film_id join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id where f.title='Antitrust Tomatoes';