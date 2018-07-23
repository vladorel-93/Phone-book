DROP SEQUENCE IF EXISTS users_counter;
DROP TABLE IF EXISTS Users;

CREATE SEQUENCE users_counter START 1;

CREATE TABLE Users
(
     id           INTEGER PRIMARY KEY default nextval('users_counter'),
     name         VARCHAR ,
     address      VARCHAR,
     phone        VARCHAR
)