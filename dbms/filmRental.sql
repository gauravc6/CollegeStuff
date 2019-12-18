-- select * from film;

-- 1 
select * from film where release_year in (2006,2009);

-- 2 
select * from film where rental_rate> (select avg(rental_rate) from film);

-- select * from rental;
-- select * from staff;

-- 3 
select rental_id, first_name, last_name from staff s, rental r where r.staff_id = s.staff_id; 