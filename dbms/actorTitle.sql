-- select * from film_actor

select first_name, last_name, title from film f, actor a, film_actor fa where f.film_id = fa.film_id and a.actor_id = fa.actor_id; 