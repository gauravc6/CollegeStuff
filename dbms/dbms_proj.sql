/*
		DBMS GROUP PROJECT
Members:
Gaurav Chandiramani - 18BCE10099
Nishq Desai			- 18BCE10177
Srijan Srivastava   - 18BCE10271
Mohammed Mehboob    - 18BCE10313
*/

-- Query 1: What are the average shipping days and required days for each city and their customer counts.	

select "ShipCity",
extract(day from avg(age("ShippedDate","OrderDate"))) as Avg_Shipping_Time,
extract(day from avg(age("RequiredDate","OrderDate"))) as Avg_Required_Time,
(select count(Customers."CustomerID")  from Customers where "ShipCity" = "City") as No_of_customers
from ordersw
group by "ShipCity"
order by No_of_customers desc;

-- Query 2: Demand of each different category in different cities.

select "ShipCity", count(ca."CategoryID") as Count_Category,"CategoryName" 
from products pr, order_details od,orders o,Categories ca
where od."OrderID" = o."OrderID"
and od."ProductID" = pr."ProductID"
and pr."CategoryID" = ca."CategoryID"
group by "ShipCity","CategoryName"
order by "ShipCity",Count_Category Desc

-- Query 3: Total Purchases done by Companies when a discount was provided.

select cu."CustomerID","CompanyName",
sum(od."Quantity"*od."UnitPrice") as total_Amount,
sum(od."Quantity"*od."UnitPrice"*"Discount") as Discount_Amount,
sum(od."Quantity"*od."UnitPrice"*(1-"Discount")) as After_Discount 
from products pr, order_details od,orders o,customers cu
where od."OrderID" = o."OrderID"
and od."ProductID" = pr."ProductID"
and cu."CustomerID" = o."CustomerID"
group by cu."CustomerID"
order by cu."CustomerID"

-- Query 4: Given an OrderID, get the client company details and the employee details of the handler.

select o."OrderID", c."CompanyName", c."Address", e."FirstName" as Employee_First_Name, e."LastName" as Employee_Last_Name
from customers c, employees e, orders o
where o."OrderID" = 10354
and o."EmployeeID" = e."EmployeeID"
and o."CustomerID" = c."CustomerID"