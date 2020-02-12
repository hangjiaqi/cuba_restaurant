package com.company.restaurant.web.screens.menu;

import com.haulmont.cuba.gui.screen.*;
import com.company.restaurant.entity.Menu;

@UiController("restaurant_Menu.edit")
@UiDescriptor("menu-edit.xml")
@EditedEntityContainer("menuDc")
@LoadDataBeforeShow
public class MenuEdit extends StandardEditor<Menu> {
}