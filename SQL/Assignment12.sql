### Problem Statement 1
#**Create a view named `customer_rental_info` that lists each customer's full name (first and last), 
#email, the number of rentals they have made, and the total amount they have spent on rentals.**
create view customer_rental_info as select c.first_name,c.last_name, c.email, count(r.rental_id), sum(p.amount) as 'Total amount' from customer c 
join rental r on r.customer_id=c.customer_id join payment p on p.rental_id=r.rental_id group by c.first_name,c.last_name,c.email,c.customer_id;
select * from customer_rental_info;

### Problem Statement 2
#**Create a view named `top_rented_films` that displays the top 10 most rented films, including the film title 
#and the number of times it has been rented.**
create view top_rented_films as select f.title,count(r.rental_id) as 'Total_Rental' from film f join inventory i on i.film_id=f.film_id
join rental r on r.inventory_id=i.inventory_id group by f.title order by Total_Rental desc limit 10;

### Problem Statement 3
#**Create a view named `active_customers` that lists all customers who have rented at least one film in the last 30 days. 
#Include the customer's full name, email, and the date of their last rental.**
create or replace view active_customers as select c.first_name,c.last_name,c.email,max(r.rental_date) as 'latest' from rental r join customer c on r.customer_id=c.customer_id 
group by c.first_name,c.last_name,c.customer_id order by c.customer_id;
#or
select c.first_name,c.last_name,c.email,max(r.rental_date) from rental r join customer c on r.customer_id=c.customer_id 
where r.rental_date>=date_sub(curdate(),interval 20 year) group by c.first_name,c.last_name,c.customer_id order by c.customer_id;

### Problem Statement 4
#**Create a view named `inventory_by_store` that displays the number of films available in each store. 
#Include the store ID and the count of films available in that store.**
create view inventory_by_store as select count(f.film_id),s.store_id from film f join inventory i on i.film_id=f.film_id join store s on i.store_id=s.store_id
group by s.store_id;

### Problem Statement 5
#**Create a view named `staff_sales_performance` that lists each staff member's full name, their store, 
#and the total sales amount they have made.**
create or replace view staff_sales_performance as select s.first_name,s.last_name,s.store_id, sum(amount) from staff s join payment p on s.staff_id=p.staff_id
group by s.staff_id;