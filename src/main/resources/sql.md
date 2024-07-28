### Createing table
```
CREATE TABLE users_projectusers
(
	id int unsigned,
    name varchar(100),
    email varchar(150),
    password varchar(100),
    contact varchar(15),
    address text,
    dob date,
    gender enum("M","F","O"),
    status boolean
)
```
### Creating table using constraints
```
CREATE TABLE student
(
	id int not null unique,
    name varchar(100) not null,
    email varchar(150) not null unique,
    age tinyint check (age>=18),
    status boolean default 1
)
```
### Insert data into tables
```
insert into students
(id,name,email,age,status)
values
(1,"hima","hima@123gmail.com",20,1),
(2,"amulya","ammu@123gmail.com",23,0)
```
### Select query

```
select * from users
```

### Select query using where condition

```
select * from users where gender='F';
```
### Delete query
```
delete from students where id=1;
```
### Update query
```
update students set email="himangi127@gmal.com" where id=1;
```
### Alter table query
```
alter table students
add constraint nameunique unique (name);
```