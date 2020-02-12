create table RESTAURANT_ORDER_MENU_LINK (
    MENU_ID bigint,
    ORDER_ID bigint,
    primary key (MENU_ID, ORDER_ID)
);
