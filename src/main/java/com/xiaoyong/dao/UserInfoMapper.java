package com.xiaoyong.dao;

import com.xiaoyong.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoMapper {
    UserInfo getUserInfoById(Integer userId);
    List<UserInfo> getUserInfoAll();
}
