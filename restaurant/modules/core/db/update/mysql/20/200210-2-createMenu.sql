alter table RESTAURANT_MENU add constraint FK_RESTAURANT_MENU_ON_NAME foreign key (NAME_ID) references RESTAURANT_SHOP(ID);
create index IDX_RESTAURANT_MENU_ON_NAME on RESTAURANT_MENU (NAME_ID);
