alter table RESTAURANT_MENU change column NAME_ID NAME_ID__U37528 bigint^
alter table RESTAURANT_MENU drop foreign key FK_RESTAURANT_MENU_ON_NAME;
drop index IDX_RESTAURANT_MENU_ON_NAME on RESTAURANT_MENU ;
alter table RESTAURANT_MENU add column SHOP_ID bigint ;
