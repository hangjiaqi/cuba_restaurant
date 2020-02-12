create table RESTAURANT_USER_ORDER (
    ID bigint,
    UUID varchar(32),
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    USER_ID_ID varchar(32) not null,
    --
    primary key (ID)
);