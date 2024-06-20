#Problem Statement 1: Retrieve Customer Information with Rental History
#Retrieve the customer's first name, last name, and the number of rentals they have made. 
#Include customers who have not made any rentals as well.
select c.first_name, c.last_name, count(r.rental_id) as 'rental_count' from customer c
left join rental r on c.customer_id = r.customer_id group by c.customer_id, c.first_name, c.last_name order by rental_count desc;

#Problem Statement 2: Display Films and Their Rental Count
#Display film titles along with the number of times each film has been rented. Include films that have not been rented at all.
select f.film_id, f.title,count(r.rental_id) from film f left join inventory i on i.film_id=f.film_id left join rental r on 
r.inventory_id=i.inventory_id group by f.film_id order by count(r.rental_id) desc; 

#Problem Statement 3: List Customers and Their Rentals
#List customers with their rental details (rental ID, rental date, and return date if available). 
#Include customers who have not made any rentals.
select c.customer_id, r.rental_id, r.rental_date, r.return_date from customer c left join rental r on c.customer_id=r.customer_id 
order by c.customer_id, r.rental_id;

#Problem Statement 4: Show Films and Customers Who Rented Them
#Display film titles and the names of customers who have rented each film. Include films that have not been rented.
select f.title, c.first_name, c.last_name from film f left join inventory i on i.film_id=f.film_id left join rental r on 
r.inventory_id=i.inventory_id left join customer c on c.customer_id=r.customer_id group by f.title, c.first_name, c.last_name; 

#Problem Statement 5: Explore Rental Returns and Late Fees
#Retrieve rental ID, return date, and any associated late fees. 
#Include rentals that have not been returned yet, displaying a NULL return date for these rentals.
select r.rental_id, r.return_date, f.rental_duration as 'late' from film f right join inventory i on i.film_id=f.film_id 
right join rental r on r.inventory_id=i.inventory_id where f.rental_duration>5 order by r.rental_id; 

#Problem Statement 1: Retrieve Films and Rental Details
#Retrieve film titles and rental details (rental ID, rental date, and return date if available). Include films that have not been rented.
select f.title,r.rental_id,r.rental_date,r.return_date from rental r right join inventory i on i.inventory_id=r.inventory_id right join
film f on i.film_id=f.film_id;


#Problem Statement 2: Display Rentals and Associated Customers
#Display rental details (rental ID, rental date, and return date if available) along with the names of customers who made those rentals. 
#Include rentals that have not been rented.
select r.rental_id,r.rental_date,r.return_date,c.first_name,c.last_name from rental r left join customer c on r.customer_id=c.customer_id; 
select * from sales_by_store;

#Problem Statement 3: List Payments with Customer Information
#List payment details (payment ID, amount, and payment date) along with the names of customers who made those payments. 
#Include payments that have not been made.
select c.customer_id, c.first_name,c.last_name,p.payment_id, p.amount, p.payment_date from customer c right join payment p on 
c.customer_id=p.customer_id;

#Problem Statement 4: Show Actors and Films They Acted In
#Display actor names and the titles of films they have acted in. Include actors who have not acted in any films.
select a.first_name,a.last_name, f.title from actor a left join film_actor fa on a.actor_id=fa.actor_id left join film f on 
f.film_id=fa.film_id; 

#Problem Statement 5: Explore Staff and Their Associated Stores
#Retrieve staff details (staff ID, first name, last name) and the store they are associated with. 
#Include staff who are not associated with any store.
select s.staff_id, s.first_name, s.last_name, st.store_id from staff s left join store st on s.store_id=st.store_id;