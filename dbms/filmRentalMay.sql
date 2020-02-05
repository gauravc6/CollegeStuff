select * from customer;
select * from rental;
select * from payment;
select * from film;
select * from inventory;


select c.customer_id, c.first_name, c.last_name
from customer c, payment p 
where month(p.payment_date) = 5 and c.customer_id = p.customer_id;


select c.customer_id, c.first_name, c.last_name, f.title
from customer c, film f, rental r, inventory i
where month(r.rental_date) = 5 and i.inventory_id = r.inventory_id and c.customer_id = r.customer_id and f.film_id = i.film_id;