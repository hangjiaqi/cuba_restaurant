alter table RESTAURANT_SHOP add constraint FK_RESTAURANT_SHOP_ON_USER foreign key (USER_ID) references SEC_USER(ID);
create index IDX_RESTAURANT_SHOP_ON_USER on RESTAURANT_SHOP (USER_ID);
