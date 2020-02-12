package com.company.restaurant.web.screens.shop;

import com.company.restaurant.entity.Menu;
import com.haulmont.cuba.core.global.Security;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.restaurant.entity.Shop;
import com.haulmont.cuba.gui.sys.AttributeAccessSupport;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.entity.UserRole;
import com.haulmont.cuba.security.global.UserSession;
import com.vaadin.annotations.VaadinServletConfiguration;

import javax.inject.Inject;
import java.util.List;

@UiController("restaurant_Shop.edit")
@UiDescriptor("shop-edit.xml")
@EditedEntityContainer("shopDc")
@LoadDataBeforeShow
public class ShopEdit extends StandardEditor<Shop> {
   /* @Inject
    private CollectionLoader<Menu> menusDl;

    @Inject
    private UserSessionSource userSessionSource;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        menusDl.setParameter("shop", getEditedEntity());
        getScreenData().loadAll();
    }

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Shop shop = getEditedEntity();
        shop.setUser(userSessionSource.getUserSession().getUser());
    }*/


}