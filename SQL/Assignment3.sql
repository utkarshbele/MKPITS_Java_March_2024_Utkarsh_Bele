use sakila;
#Retrieve the first 10 characters of the title of each film.**
select mid(title,1,10) as 'title_short' from film_text;
#**Convert the titles of all films to uppercase.**
select upper(title) from film_text;
#**Find the length of each film title.**
select length(title) as 'Title_length' from film_text;
#**Concatenate the first name and last name of each actor, separated by a space.**
select concat_ws(" ",first_name,last_name) as 'name' from actor;
#5. **Replace the word "Action" with "Thriller" in the film description.**
select replace(description, "Action","Thriller") from film;
#6. **Extract the domain name from the email addresses of all customers.**
select substring_index(email,'@',-1) as 'domain' from customer;
#7. **Find all films whose title starts with the letter 'A'.**
select * from film where title like "A%";
#8. **Trim leading and trailing spaces from the first names of customers.**
select trim(first_name) as 'name' from customer;
#9. **Find the position of the first occurrence of the word "GREAT" in the film description.**
select locate("Great", description) from film;
#10. **Reverse the first name of each customer.**
select reverse(first_name) from customer;
#11. **Round the rental rate of each film to 2 decimal places.**
select round(rental_rate,2) from film;
#12. **Calculate the square root of the replacement cost of each film.**
select sqrt(replacement_cost) from film;
#13. **Find the absolute value of the difference between rental duration and length for each film.**
select abs(length-rental_duration) from film;
#14. **Raise the rental rate of each film to the power of 3.**
select pow(rental_rate,3) from film;
#15. **Get the ceiling value of the replacement cost of each film.**
select ceil(replacement_cost) from film;
#16. **Get the floor value of the replacement cost of each film.**
select floor(replacement_cost) from film;
#17. **Calculate the modulus (remainder) of the rental duration divided by 3 for each film.**
select rental_duration mod 3 from film;
#18. **Get the highest rental rate of all films.**
select max(rental_rate) from film;
#19. **Get the lowest replacement cost of all films.**
select min(replacement_cost) from film;
#20. **Calculate the average length of all films.**
select avg(length) from film;
#21. **Extract the year from the rental date for each rental.**
select substring_index(rental_date,"-",+1) from rental;
#22. **Find the day of the week for each rental date.**
select dayname(rental_date) from rental;
#23. **Calculate the age of each customer based on their create_date.**
select date_format(FROM_DAYS(DATEDIFF(NOW(),create_date)), '%Y')as age from customer;
#24. **Add 7 days to the rental date to get the return due date for each rental.**
select day(rental_date+7) as return_due_date from rental;
#25. **Get the month name from the rental date for each rental.**
select monthname(rental_date) from rental;
#26. **Extract the hour from the last update timestamp of each film.**
select hour(last_update) from film;
#27. **Calculate the difference in days between the return date and rental date for each rental.**
select datediff(return_date, rental_date) from rental;
#28. **Find the first day of the month for each rental date.**
select day(rental_date) from rental;
#29. **Format the rental date as 'DD-MM-YYYY' for each rental.**
select date_format(rental_date,'%d %m %Y') from rental;
#30. **Extract the quarter from the rental date for each rental.**
select quarter(rental_date) from rental;
#31. **Find the ASCII value of the first character of each film title.**
select ascii(title) from film;
#32. **Return the binary representation of the film_id for each film.**
select bin(film_id) from film;
#33. **Convert the rental duration of each film to a hexadecimal value.**
select hex(rental_duration) from film;
#34. **Find all films with a replacement cost that is a power of 2.**
select if(mod(floor(replacement_cost),2)!=0 and mod(floor(replacement_cost),2)=1,"yes","no") from film;
#35. **Check if the length of the film title is even or odd.**
select  title, if(mod(char_length(title),2)=0,"Even","Odd") from film; 
#36. **Find all films with a rental rate greater than 3 and categorize them as 'High' or 'Low'.**
select if(rental_rate>3,'High','low') from film;
#37. **Return the IP address equivalent of the film_id for the first 10 films.**
select inet_ntoa(film_id) from film;
#38. **Select the 3rd character of each film title.**
select substring(title,3,1) from film;
#39. **Return the Unicode code point of the first character of each actor's first name.**
select convert(substring(first_name,1,1) using utf8) from actor;
#40. **Convert the rental rate of each film to a binary string.
select bin(rental_rate) from film;

#SELECT default_character_set_name FROM information_schema.SCHEMATA S WHERE schema_name = "sakila";