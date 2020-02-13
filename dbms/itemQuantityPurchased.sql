-- select * from products;
-- select * from orders;
-- select * from order_details;

create or replace function itemQuantityPurchased(CustID Varchar)
returns table(ProductName varchar, Quantity bigint)as
$$
begin return query
select p."ProductName", sum(od."Quantity")
from products p, order_details od, orders o
where o."CustomerID" = CustID
	and od."OrderID" = o."OrderID"
	and p."ProductID" = od."ProductID"
	group by "ProductName";
end; $$
language plpgsql;

select * from itemsPurchased('VINET');