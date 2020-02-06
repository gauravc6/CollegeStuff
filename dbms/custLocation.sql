select * from customer;
select * from city;
select * from address;
select * from country;

# country has country id
# customer has id, address id, district
# address has address_id and city_id
# city has city name, city id, country id

select concat(c.first_name," ",c.last_name), c.email, district, city, country 
from customer c, city cit, country cty, address a
where c.first_name like "A%" and cit.city like "AL%" 
and cty.country_id = cit.country_id
and c.address_id = a.address_id 
and a.city_id = cit.city_id;