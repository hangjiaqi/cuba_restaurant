package com.company.restaurant.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.Creatable;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.annotation.IdSequence;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@NamePattern("%s - %s|userOrder,orderTime,shopName,menus")
@Table(name = "RESTAURANT_ORDER")
@Entity(name = "restaurant_Order")
@IdSequence(name = "id")
public class Order extends BaseLongIdEntity implements Creatable, HasUuid {
    private static final long serialVersionUID = 3472454450189900686L;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "ORDER_TIME", nullable = false)
    private Date orderTime;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ORDER")
    private User userOrder;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SHOP_NAME_ID")
    private Shop shopName;

    @JoinTable(name = "RESTAURANT_ORDER_MENU_LINK",
            joinColumns = @JoinColumn(name = "ORDER_ID"),
            inverseJoinColumns = @JoinColumn(name = "MENU_ID"))
    @ManyToMany
    private Set<Menu> menus;

    @Column(name = "CREATE_TS")
    private Date createTs;

    @Column(name = "CREATED_BY", length = 50)
    private String createdBy;

    @Column(name = "UUID")
    private UUID uuid;

    public User getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(User userOrder) {
        this.userOrder = userOrder;
    }

    public Shop getShopName() {
        return shopName;
    }

    public void setShopName(Shop shopName) {
        this.shopName = shopName;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
}