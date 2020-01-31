create table employee;

select * from employee;

create view employee_view as 
(select first_name, salary from employee);

select * from employee_view;