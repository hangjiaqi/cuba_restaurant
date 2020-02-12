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
import java.util.UUID;

@NamePattern("%s|name")
@Table(name = "RESTAURANT_SHOP")
@Entity(name = "restaurant_Shop")
@IdSequence(name = "id")
public class Shop extends BaseLongIdEntity implements Creatable, HasUuid {
    private static final long serialVersionUID = -6567869434784083467L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @Column(name = "CREATE_TS")
    private Date createTs;

    @Column(name = "CREATED_BY", length = 50)
    private String createdBy;

    @Column(name = "UUID")
    private UUID uuid;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}