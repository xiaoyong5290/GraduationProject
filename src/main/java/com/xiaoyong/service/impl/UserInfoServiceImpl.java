package com.xiaoyong.service.impl;

import com.xiaoyong.dao.UserInfoMapper;
import com.xiaoyong.entity.UserInfo;
import com.xiaoyong.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoMapper userInfoDAO;

    @Override
    public UserInfo queryById(Integer userId) {
        return userInfoDAO.getUserInfoById(userId);
    }

    @Override
    public List<UserInfo> queryAll() {
        return userInfoDAO.getUserInfoAll();
    }
}
