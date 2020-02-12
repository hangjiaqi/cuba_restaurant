package com.company.restaurant.web.screens.shop;

import com.company.restaurant.entity.Menu;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.core.global.View;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.DataComponents;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.company.restaurant.entity.Shop;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;

@UiController("restaurant_Shop.browse")
@UiDescriptor("shop-browse.xml")
@LookupComponent("shopsTable")
@LoadDataBeforeShow
public class ShopBrowse extends StandardLookup<Shop> {
//
//    @Inject
//    private CollectionLoader shopsDl;
//
//    @Inject
//    private DataComponents dataComponents;
//
//    @Inject
//    private UserSessionSource userSessionSource;

  /*  @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        UserSession userSession = userSessionSource.getUserSession();
        if (userSession.getRoles().contains("管理员仅供创建菜单餐厅")) {
            shopsDl.setParameter("userSession", userSession.getUser());
        }else{
            shopsDl.setQuery("select e from restaurant_Shop e");
        }
        getScreenData().loadAll();
    }*/
}