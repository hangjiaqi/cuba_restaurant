-- begin RESTAURANT_ORDER
create table RESTAURANT_ORDER (
    ID bigint,
    UUID varchar(32),
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    ORDER_TIME date not null,
    USER_ORDER varchar(32) not null,
    SHOP_NAME_ID bigint not null,
    --
    primary key (ID)
)^
-- end RESTAURANT_ORDER
-- begin RESTAURANT_SHOP
create table RESTAURANT_SHOP (
    ID bigint,
    UUID varchar(32),
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    NAME varchar(255) not null,
    USER_ID varchar(32),
    --
    primary key (ID)
)^
-- end RESTAURANT_SHOP
-- begin RESTAURANT_MENU
create table RESTAURANT_MENU (
    ID bigint,
    UUID varchar(32),
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    --
    SHOP_ID bigint,
    MENU_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end RESTAURANT_MENU
-- begin RESTAURANT_ORDER_MENU_LINK
create table RESTAURANT_ORDER_MENU_LINK (
    ORDER_ID bigint,
    MENU_ID bigint,
    primary key (ORDER_ID, MENU_ID)
)^
-- end RESTAURANT_ORDER_MENU_LINK
