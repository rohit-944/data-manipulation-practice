show databases;

drop database practice

create database College

Show databases;

use college


CREATE TABLE Student (
    id INT ,
    name VARCHAR(100),
    age INT,
    address VARCHAR(255)
);

INSERT INTO Student (id, name, age, address) VALUES
(1, 'John Doe', 20, '123 Main Street, New York, NY'),
(2, 'Jane Smith', 22, '456 Elm Street, Los Angeles, CA'),
(3, 'Michael Brown', 19, '789 Oak Avenue, Chicago, IL'),
(4, 'Emily Davis', 21, '321 Pine Lane, Houston, TX'),
(5, 'William Johnson', 23, '654 Maple Drive, Miami, FL');

Show tables;

Select * from Student;


alter table Student
Rename to Student1;

Select * from Student1;

create table Student2 (
Rollno INT,
Name VARCHAR(50),
Marks INT not NULL,
Grade VARCHAR(1),
Address VARCHAR(100)
);

Select * from Student2;

ALTER TABLE Student2
RENAME COLUMN Nmae TO Name;

Describe Student2;

INSERT INTO Student2 (Rollno, Name, Marks, Grade, Address)
VALUES
(101, "anil", 78, "C", "Pune"),
(102, "bhumika", 93, "A", "Mumbai"),
(103, "chetan", 85, "B", "Mumbai"),
(104, "dhruv", 96, "A", "Delhi"),
(105, "emanuel", 12, "F", "Delhi"),
(106, "farah", 82, "B", "Delhi");

Show tables;

drop table Student;

Select * from Student1;
Select * from Student2;










