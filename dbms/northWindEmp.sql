-- select * from orders;
-- select * from employees;
-- select * from customers;

select e."FirstName", e."LastName", c."CompanyName", c."Address" 
from customers c, orders o, employees e
where o."OrderID" = 10354 
	and o."CustomerID" = c."CustomerID" 
	and o."EmployeeID" = e."EmployeeID";