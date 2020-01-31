create table student
(student_id int auto_increment,
first_name varchar(50) not null,
last_name varchar(50) not null,
primary key(student_id))auto_increment=100;

select * from student;

insert into student(first_name, last_name) values("Alyx","Vance");
insert into student(first_name, last_name) value("Gordon","Freeman");

insert into student(first_name, last_name, salary, dept_name)
values("Eli","Vance",truncate(3489.6543,2),"PHY");

alter table student add salary numeric(8,2) not null;
alter table student add dept_name char(3) not null;

update student set dept_name="ECE" where student_id=100;