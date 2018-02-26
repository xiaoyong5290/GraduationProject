package com.xiaoyong.controller;

import com.xiaoyong.dao.UserInfoMapper;
import com.xiaoyong.entity.UserInfo;
import com.xiaoyong.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
public class WelcomeController {

    @Autowired
    private UserInfoServiceImpl userInfoServiceImpl;

    @RequestMapping("/welcome")
    @ResponseBody
    public ModelAndView welcome(Integer userId) {
        UserInfo userInfo = userInfoServiceImpl.queryById(userId);
        System.out.println(userInfo);
        List<UserInfo> userInfoList = userInfoServiceImpl.queryAll();
        for (UserInfo ui : userInfoList) {
            System.out.println(ui);
        }
        return new ModelAndView("index","info",userInfoList);
    }
}
