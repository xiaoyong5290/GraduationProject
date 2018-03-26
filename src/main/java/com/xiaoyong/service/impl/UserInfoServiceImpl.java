package com.xiaoyong.service.impl;

import com.xiaoyong.model.dao.UserInfoMapper;
import com.xiaoyong.model.entity.UserInfo;
import com.xiaoyong.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

 /**
    *    @author  : XiaoYong
    *    @date    : 2018/3/24 14:26
    *    Description    :
    */

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoDAO;

    public UserInfo queryById(Integer userId) {
        return userInfoDAO.getUserInfoById(userId);
    }

    public List<UserInfo> queryAll() {
        return userInfoDAO.getUserInfoAll();
    }
}
