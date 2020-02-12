alter table RESTAURANT_MENU add column MENU_NAME varchar(255) ^
update RESTAURANT_MENU set MENU_NAME = '' where MENU_NAME is null ;
alter table RESTAURANT_MENU modify column MENU_NAME varchar(255) not null ;
