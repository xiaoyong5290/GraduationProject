package com.xiaoyong.model.dao;


import com.xiaoyong.model.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

 /**
    *    @author  : XiaoYong
    *    @date    : 2018/3/24 14:25
    *    Description    :
    */

@Repository
public interface UserInfoMapper {
    UserInfo getUserInfoById(Integer userId);
    List<UserInfo> getUserInfoAll();
}
