# create database CamilaCatering;

create table Menu(
MenuID int auto_increment primary key,
MenuDesc varchar(100) not null,
Appetizers varchar(100),
Maincourse varchar(100),
Desserts varchar(100)
);

create table Event(
EventID int auto_increment primary key,
EventType varchar(50) not null,
EventDesc varchar(100)
);

create table Customer(
CustomerID int auto_increment primary key,
FirstName varchar(50) not null,
LastName varchar(50),
Address varchar(100) not null,
Phone int not null,
Email varchar(50)
);

create table Booking(
BookingID int auto_increment primary key,
EventID int,
MenuID int,
CustomerID int,
constraint FK_EventBooking foreign key (EventID) references Event(EventID),
constraint FK_MenuBooking foreign key (MenuID) references Menu(MenuID),
constraint FK_CustomerBooking foreign key (CustomerID) references Customer(CustomerID),
Guests int not null,
Cost float not null,
BookingDate date not null,
EventDate date not null  
);

select * from Booking;