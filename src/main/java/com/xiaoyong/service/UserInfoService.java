package com.xiaoyong.service;


import com.xiaoyong.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    UserInfo queryById(Integer userId);
    List<UserInfo> queryAll();
}
