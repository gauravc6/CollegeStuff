create table Employee(
employer_id int auto_increment primary key,
first_name varchar(50),
last_name varchar(50));

insert into Employee(first_name, last_name) values("Hello","Friend");

select * from Employee;