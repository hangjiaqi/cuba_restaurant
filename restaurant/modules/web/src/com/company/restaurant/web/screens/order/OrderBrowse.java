package com.company.restaurant.web.screens.order;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.core.global.UserSessionSource;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.screen.*;
import com.company.restaurant.entity.Order;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@UiController("restaurant_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {

//    @Inject
//    UserSessionSource userSessionSource;

    @Inject
    UserSession userSession;

    @Inject
    private DataManager dataManager;

    private boolean checkCreate(User user) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date now = null;
        try {
            now = sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dataManager.load(Order.class).
                query("select p from restaurant_Order p where p.userOrder =:userOrder and p.orderTime = :now")
                .parameter("userOrder", user).parameter("now", now).list().isEmpty();
    }

    @Inject
    private Notifications notifications;

    @Inject
    private ScreenBuilders screenBuilders;

    @Inject
    private Metadata metadata;


    @Subscribe("ordersTable.create")
    public void onOrdersTableCreate(Action.ActionPerformedEvent event) {
//        if (!checkCreate(userSessionSource.getUserSession().getUser())){
//            throw new RuntimeException("今天订餐配额已超过");
//        }
        if (!checkCreate(userSession.getUser())) {
            notifications.create(Notifications.NotificationType.ERROR)
                    .withCaption("今天订餐配额已超过").show();
        } else {
             OrderEdit orderEdit=screenBuilders.screen(this)
                     .withScreenClass(OrderEdit.class)
            .build();
             orderEdit.setEntityToEdit(metadata.create(Order.class));
             orderEdit.show();
        }

    }
}