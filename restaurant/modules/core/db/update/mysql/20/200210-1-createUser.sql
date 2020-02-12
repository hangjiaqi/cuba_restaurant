create table RESTAURANT_USER (
    ID bigint,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    NAME varchar(255) not null,
    IS_ADMIN boolean not null,
    --
    primary key (ID)
);