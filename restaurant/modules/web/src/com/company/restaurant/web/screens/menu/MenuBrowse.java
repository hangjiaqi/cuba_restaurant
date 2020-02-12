package com.company.restaurant.web.screens.menu;

import com.company.restaurant.entity.Shop;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.restaurant.entity.Menu;

import javax.inject.Inject;

@UiController("restaurant_Menu.browse")
@UiDescriptor("menu-browse.xml")
@LookupComponent("menusTable")
@LoadDataBeforeShow
public class MenuBrowse extends StandardLookup<Menu> {
}