package com.xiaoyong.model.entity;


import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author : XiaoYong
 * @date : 2018/3/24 14:25
 * Description    :
 */

@Repository
public class UserInfo implements Serializable {
    private Integer userId;
    private String userName;
    private String pwd;

    @SuppressWarnings("unused")
    public Integer getUserId() {
        return userId;
    }

    @SuppressWarnings("unused")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @SuppressWarnings("unused")
    public String getUserName() {
        return userName;
    }

    @SuppressWarnings("unused")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @SuppressWarnings("unused")
    public String getPwd() {
        return pwd;
    }

    @SuppressWarnings("unused")
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "ID： " + userId + " Name： " + userName + " Pwd： " + pwd;
    }
}