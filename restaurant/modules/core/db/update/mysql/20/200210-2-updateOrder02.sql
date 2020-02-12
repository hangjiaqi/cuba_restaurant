-- update RESTAURANT_ORDER set USER_ORDER_ID = <default_value> where USER_ORDER_ID is null ;
alter table RESTAURANT_ORDER modify column USER_ORDER_ID bigint not null ;
