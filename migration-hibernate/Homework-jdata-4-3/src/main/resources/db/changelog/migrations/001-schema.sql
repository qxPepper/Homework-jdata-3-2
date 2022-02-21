create table cars
(
    id      int auto_increment primary key,
    name    varchar(20) not null,
    manufacturer varchar(40),
    price   int
)