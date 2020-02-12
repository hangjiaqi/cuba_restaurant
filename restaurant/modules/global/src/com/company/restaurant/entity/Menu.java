package com.company.restaurant.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.Creatable;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.annotation.IdSequence;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Table(name = "RESTAURANT_MENU")
@Entity(name = "restaurant_Menu")
@NamePattern("%s|menuName")
@IdSequence(name = "id")
public class Menu extends BaseLongIdEntity implements HasUuid, Creatable {
    private static final long serialVersionUID = -9025844880654581342L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHOP_ID")
    private Shop shop;

    @NotNull
    @Column(name = "MENU_NAME", nullable = false)
    private String menuName;

    @Column(name = "CREATE_TS")
    private Date createTs;

    @Column(name = "CREATED_BY", length = 50)
    private String createdBy;

    @Column(name = "UUID")
    private UUID uuid;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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

}