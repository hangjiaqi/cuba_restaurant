create table RESTAURANT_ORDER (
    ID bigint,
    UUID varchar(32),
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    ORDER_TIME date not null,
    SHOP_NAME_ID bigint not null,
    --
    primary key (ID)
);