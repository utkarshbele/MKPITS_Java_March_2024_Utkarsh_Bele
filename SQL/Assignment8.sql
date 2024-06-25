use sakila;
#1. High revenue categories:
#Find categories with an average/sum rental revenue greater than $10.
select c.category_id, c.name, sum(p.amount) from category c join film_category fc on fc.category_id=c.category_id 
join film f on f.film_id=fc.film_id join inventory i on i.film_id=f.film_id join rental r on r.inventory_id=i.inventory_id
join payment p on p.rental_id=r.rental_id group by c.category_id having sum(amount)>10;

#2. Customers with many rentals:
#Identify customers who have rented more than 30 films.
select c.customer_id, count(f.film_id) from customer c join rental r on r.customer_id=c.customer_id
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id group by c.customer_id having count(f.film_id)>30;

#3. Popular languages:
#List languages with more than 50 films.
select l.name,l.language_id, count(f.film_id) from language l join film f on l.language_id=f.language_id 
group by l.language_id having count(f.film_id)>50;

#4. Stores with high revenue:
#Find stores with total revenue exceeding $5000.
select st.store_id,sum(p.amount) as "Total Revenue" from store st join staff s on st.store_id=s.store_id 
join payment p on p.staff_id=s.staff_id group by st.store_id having sum(p.amount)>5000;

#5. Actors in popular films:
#Show actors who have appeared in more than 10 films.
select a.actor_id,a.first_name,a.last_name from actor a join film_actor fa on fa.actor_id=a.actor_id join film f on f.film_id=fa.film_id
group by actor_id having count(f.film_id)>10;

#6. Staff with high customer interactions:
#List staff members who have handled more than 500 customer transactions.
select s.staff_id, s.first_name, s.last_name , count(p.payment_id) from staff s join payment p on p.staff_id=s.staff_id
group by s.staff_id having count(p.payment_id)>500;

#7. Active customers:
#Identify customers who have rented in the last 30 days.
select c.customer_id, c.first_name, c.last_name, r.last_update from customer c join rental r on c.customer_id=r.customer_id 
group by c.customer_id,r.last_update having day(r.last_update)>30;

#8. Long rentals:
#List films with an average rental duration of more than 7 days.
select film_id, title from film group by film_id having avg(rental_duration)>7;

#9. Highly rented films:
#Identify films that have been rented more than 30 times.
select f.film_id,f.title, count(r.rental_id) from film f join inventory i on i.film_id=f.film_id 
join rental r on r.inventory_id=i.inventory_id group by f.film_id having count(r.rental_id)>30;

#10. Customers with diverse film preferences:
#Find customers who have rented films from at least 5 different categories.
select c.customer_id, c.first_name, c.last_name, count(distinct(cat.name)) as 'film_count' from customer c join rental r on r.customer_id=c.customer_id
join inventory i on i.inventory_id=r.inventory_id join film f on f.film_id=i.film_id join film_category fc on fc.film_id=f.film_id
join category cat on cat.category_id=fc.category_id group by c.customer_id having film_count>=5;