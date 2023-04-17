-- liquibase formatted sql
-- changeset mike.w:1
create table public.person
(
    id         bigint not null
        constraint pk_person
            primary key,
    first_name varchar(255),
    surname    varchar(255),
    birthdate  date
);
