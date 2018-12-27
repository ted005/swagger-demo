drop table person;

create table person (
  id int not null primary key,
  name varchar(32) not null,
  phoneNumber int,
  address varchar(32),
)