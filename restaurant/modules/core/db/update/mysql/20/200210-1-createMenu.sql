create table RESTAURANT_MENU (
    ID bigint,
    UUID varchar(32),
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    NAME_ID bigint,
    --
    primary key (ID)
);