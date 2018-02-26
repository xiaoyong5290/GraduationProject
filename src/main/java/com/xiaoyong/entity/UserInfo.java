package com.xiaoyong.entity;


import java.io.Serializable;

public class UserInfo implements Serializable{
    private Integer userId;
    private String userName;
    private String pwd;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "ID： " + userId + " Name： " + userName + " Pwd： " + pwd;
    }
}