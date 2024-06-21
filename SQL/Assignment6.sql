#Problem Statement 1: Retrieve Customers Who Have Rented the Same Film Twice
#Retrieve the customer IDs and film titles for customers who have rented the same film more than once.


#Problem Statement 2: Find Actors Who Have Worked Together in a Film
#Retrieve pairs of actor names who have worked together in the same film.

#Problem Statement 3: Identify Customers Who Share the Same Address
#Retrieve pairs of customer names who share the same address.
select c1.customer_id, c1.first_name, c1.last_name, c1.address_id from customer c1 join customer c2 on c1.address_id=c2.address_id;
#or
select A.first_name as first_name1,A.last_name as last_name2,B.first_name as first_name2,B.last_name as last_name2
from customer A,customer B where A.customer_id<>B.customer_id
and A.address_id=B.address_id order by A.address_id;

#Problem Statement 4: Find Employees and Their Managers
#Retrieve employee names and their corresponding manager names within the same department.
select st.staff_id, s.manager_staff_id from store s join staff st on s.store_id=st.store_id;

#Problem Statement 5: Identify Films with Similar Titles
#Retrieve pairs of film titles that have a similar title structure (e.g., differing by one character or having a common substring).
select f1.title,f2.title from film f1 join film f2 on f1.title=f2.title where f1.title like concat('%', substring(f2.title, 1, 8), '%')
or f2.title like concat('%', substring(f1.title, 1, 8), '%');
