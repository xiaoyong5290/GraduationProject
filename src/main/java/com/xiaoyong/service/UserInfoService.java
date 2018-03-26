package com.xiaoyong.service;


import java.util.List;

public interface UserInfoService {
    com.xiaoyong.model.entity.UserInfo queryById(Integer userId);
    List<com.xiaoyong.model.entity.UserInfo> queryAll();
}
