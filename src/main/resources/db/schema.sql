drop table if exists person;

create table person (
  id int not null primary key,
  name varchar(32) not null,
  phoneNumber BIGINT ,
  address varchar(32),
)