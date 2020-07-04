package com.brother.support.controller;

import com.brother.support.domain.UserInfo;
import com.brother.support.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Desc
 * @reason liguotao
 * 20/7/4
 */
@Controller
@RequestMapping("user")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @GetMapping("/qryUserList")
    public String qryUserList(Model model) {
        List<UserInfo> userInfos = userInfoService.qryUserInfoList();
        model.addAttribute("userList", userInfos);
        return "qry_user_list";
    }


    @GetMapping("/qryUserDetail")
    public String qryUserDetail(String userName, Model model) {
        UserInfo userInfo = userInfoService.qryUserInfoByUserName(userName);
        model.addAttribute("userInfo", userInfo);
        return "qry_user_detail";
    }



    @GetMapping("/addUserJump")
    public String addUserJump(Model model) {
        model.addAttribute("sss", "111");
        return "add_user";
    }

    @PostMapping(value = "/addUser")
    public String addUser( UserInfo userInfo) {
        userInfoService.addUserInfo(userInfo);
        return "main";
    }
}
