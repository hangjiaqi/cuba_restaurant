alter table RESTAURANT_ORDER_MENU_LINK add constraint FK_ORDMEN_ON_MENU foreign key (MENU_ID) references RESTAURANT_MENU(ID);
alter table RESTAURANT_ORDER_MENU_LINK add constraint FK_ORDMEN_ON_ORDER foreign key (ORDER_ID) references RESTAURANT_ORDER(ID);