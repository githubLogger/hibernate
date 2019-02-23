package com.log.hibernate.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "t_user", schema = "mybatis_study", catalog = "")
public class User{
    private int id;
    private String username;
    private String password;
    private Float account;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "account")
    public float getAccount() {
        return account;
    }

    public void setAccount(float account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User tUser = (User) o;

        if (id != tUser.id) return false;
        if (username != null ? !username.equals(tUser.username) : tUser.username != null) return false;
        if (password != null ? !password.equals(tUser.password) : tUser.password != null) return false;
        if (account != null ? !account.equals(tUser.account) : tUser.account != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        return result;
    }
}