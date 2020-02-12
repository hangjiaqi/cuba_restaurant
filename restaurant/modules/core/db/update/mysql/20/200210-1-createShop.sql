create table RESTAURANT_SHOP (
    ID bigint,
    UUID varchar(32),
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
);