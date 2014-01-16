# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table employee (
  employee_id               integer primary key AUTOINCREMENT,
  first_name                varchar(255),
  last_name                 varchar(255),
  middle_name               varchar(255))
;




# --- !Downs

PRAGMA foreign_keys = OFF;

drop table employee;

PRAGMA foreign_keys = ON;

