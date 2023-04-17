-- liquibase formatted sql
-- changeset mike.w:2

create table public.account
(
    id        bigint not null
        constraint pk_account
            primary key,
    username  varchar(255),
    password  varchar(255),
    person_id bigint
        constraint fk_account_on_person
            references public.person
);
