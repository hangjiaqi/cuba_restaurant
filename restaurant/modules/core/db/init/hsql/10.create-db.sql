-- begin RESTAURANT_MENU
create table RESTAURANT_MENU (
    ID bigint not null,
    UUID varchar(36),
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    --
    NAME_ID bigint,
    --
    primary key (ID)
)^
-- end RESTAURANT_MENU
-- begin RESTAURANT_ORDER
create table RESTAURANT_ORDER (
    ID bigint not null,
    UUID varchar(36),
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    --
    ORDER_TIME date not null,
    SHOP_NAME_ID bigint not null,
    --
    primary key (ID)
)^
-- end RESTAURANT_ORDER
-- begin RESTAURANT_SHOP
create table RESTAURANT_SHOP (
    ID bigint not null,
    UUID varchar(36),
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end RESTAURANT_SHOP
-- begin RESTAURANT_USER_ORDER
create table RESTAURANT_USER_ORDER (
    ID bigint not null,
    UUID varchar(36),
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    --
    USER_ID_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end RESTAURANT_USER_ORDER
-- begin RESTAURANT_USER
create table RESTAURANT_USER (
    ID bigint not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    --
    NAME varchar(255) not null,
    IS_ADMIN boolean not null,
    --
    primary key (ID)
)^
-- end RESTAURANT_USER

-- begin RESTAURANT_ORDER_MENU_LINK
create table RESTAURANT_ORDER_MENU_LINK (
    ORDER_ID varchar(36) not null,
    MENU_ID varchar(36) not null,
    primary key (ORDER_ID, MENU_ID)
)^
-- end RESTAURANT_ORDER_MENU_LINK
