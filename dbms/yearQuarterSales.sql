select cat."CategoryName", pr."ProductName", 
cast(sum(od."UnitPrice"*od."Quantity" * (1-od."Discount")) 
	 as DECIMAL(10,2)) as AggregateSales,
extract(QUARTER from o."OrderDate") as "Quarter"
from orders o, order_details od, products pr, categories cat
where o."OrderID" = od."OrderID"
and pr."CategoryID" = cat."CategoryID"
and od."ProductID" = pr."ProductID"
and extract(year from o."OrderDate")=1998
group by cat."CategoryName", pr."ProductName", extract(QUARTER from o."OrderDate")