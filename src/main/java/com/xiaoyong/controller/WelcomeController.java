package com.xiaoyong.controller;

import com.xiaoyong.service.UserInfoService;
import org.springframework.stereotype.Controller;
import com.xiaoyong.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

 /**
    *    @author  : XiaoYong
    *    @date    : 2018/3/26 14:34
    *    Description    :
    */

@Controller
@RequestMapping
public class WelcomeController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/welcome")
    @ResponseBody
    public ModelAndView welcome(Integer userId) {
/*        UserInfo userInfo = userInfoServiceImpl.queryById(userId);
        System.out.println(userInfo);
        List<UserInfo> userInfoList = userInfoServiceImpl.queryAll();
        for (UserInfo ui : userInfoList) {
            System.out.println(ui);
        }
        return new ModelAndView("index","info",userInfoList);*/
        return new ModelAndView("index","info", userInfoService.queryAll());
    }
}
