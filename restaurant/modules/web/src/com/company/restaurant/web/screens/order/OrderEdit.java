package com.company.restaurant.web.screens.order;

import com.company.restaurant.entity.Menu;
import com.company.restaurant.entity.Shop;
import com.company.restaurant.web.screens.menu.MenuBrowse;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.builders.LookupBuilderProcessor;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.restaurant.entity.Order;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import javax.inject.Inject;
import java.util.*;
import java.util.stream.Collectors;

@UiController("restaurant_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
public class OrderEdit extends StandardEditor<Order> {

//    @Inject
//     PickerField<Shop> shopNameField;
//
//    @Inject
//     ScreenBuilders screenBuilders;

    @Inject
    DataManager dataManager;

    @Inject
    CollectionLoader<Menu> menusDl;

    @Inject
    LookupField<Menu> menusField;

    @Inject
    Metadata metadata;

    @Inject
    CollectionPropertyContainer<Menu> menuShopDc;

    @Inject
    UserSessionSource userSessionSource;


    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        menusDl.setParameter("shop", metadata.create(Shop.class));
        getScreenData().loadAll();
    }

    @Subscribe("shopNameField")
    public void onShopNameFieldValueChange(HasValue.ValueChangeEvent<Shop> event) {
        menusField.setValue(null);
        menusDl.setParameter("shop", getEditedEntity().getShopName());
        //变更shop name 清空容器
        menuShopDc.setDisconnectedItems(null);
        if (null != getEditedEntity().getMenus()) {
            getEditedEntity().getMenus().clear();
        }
        menusDl.load();
    }

    @Subscribe("menusTable.add")
    public void onMenusTableAdd(Action.ActionPerformedEvent event) {
        Set<Menu> menus = getEditedEntity().getMenus();
        if (menus == null) {
            menus = new HashSet<>();
        }
        if(menusField.getValue()!=null){
            menus.add(menusField.getValue());
            getEditedEntity().setMenus(menus);
            menuShopDc.setDisconnectedItems(menus);
        }
    }

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Order order = getEditedEntity();
        order.setOrderTime(new Date());
        if (order.getUserOrder() == null) {
            order.setUserOrder(userSessionSource.getUserSession().getUser());
        } else {
            dataManager.commit(order);
        }
        getScreenData().loadAll();
    }

   /*  void showMenuOfShop(Shop shop) {
        MenuBrowse cityBrowse = screenBuilders.screen(this)
                .withScreenClass(MenuBrowse.class)
                .build();
        cityBrowse.setShop(shop);
        cityBrowse.show();
    }*/

}