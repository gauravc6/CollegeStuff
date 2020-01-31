create table Employee(
employer_id int auto_increment primary key,
first_name varchar(50),
last_name varchar(50),
salary float);

insert into Employee(first_name, last_name, salary) values("Hello","Friend",1000);

select * from Employee;