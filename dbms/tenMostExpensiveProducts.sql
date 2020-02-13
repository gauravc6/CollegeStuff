-- select * from products; 
create or replace function tenMostExpensiveProducts()
returns table(ProductName varchar, UnitPrice real)as
$$
begin return query
select "ProductName", "UnitPrice"
from products
order by "UnitPrice" desc
limit 10;
end; $$
language plpgsql;

select * from tenMostExpensiveProducts();
