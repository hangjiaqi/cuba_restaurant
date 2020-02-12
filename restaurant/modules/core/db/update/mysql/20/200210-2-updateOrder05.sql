-- alter table RESTAURANT_ORDER add column USER_ORDER varchar(32) ^
-- update RESTAURANT_ORDER set USER_ORDER = <default_value> ;
-- alter table RESTAURANT_ORDER modify column USER_ORDER varchar(32) not null ;
alter table RESTAURANT_ORDER add column USER_ORDER varchar(32) not null ;
