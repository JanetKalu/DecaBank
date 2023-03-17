create database if not exists `DecaBank`;
use `DecaBank`;

create table if not exists `users`(
    `id` int auto_increment not null,
    `username` varchar(25) not null,
    `password` varchar(25) not null,
    `enabled` tinyint not null,
    primary key(id)
    );

create table if not exists `authorities`(
    `id` int auto_increment not null,
    `username` varchar(25) not null,
    `authority` varchar(25) not null,
    primary key(id));


Insert IGNORE INTO `authorities`(id, username, authority)
values
(null, 'Ugonna', 'write'),
(null, 'Adaeze', 'read'),
(null, 'Uchenna', 'read');

Insert IGNORE into `users`(id, username, password, enabled)
values
    (null, 'Ugonna', 'ugo1234', '1'),
    (null, 'Adaeze', 'ada1234', '1'),
    (null, 'Uchenna', 'uche1234','1');

create table if not exists `customer`(
    id int auto_increment not null,
    email varchar(30) unique not null,
    password varchar(30) not null,
    role varchar(20) not null,
    primary key(id)
);

Insert IGNORE into `customer`(id, email, password, role)
values
    (null, 'adaeze@testmail.com','Eada1234', 'admin');
    /*(null, 'Peter', 'Obi',  '2349078956432', 'user', 'M', 'peterobi@testmail.com', 'Opeter1234'),
    (null, 'Nancy', 'Queens', '+1-45389765', 'admin', 'F', 'nancyqueens@testmail.com','Qnancy1234');
*/




