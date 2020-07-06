package com.brother.support.controller;

import com.brother.support.domain.UserInfo;
import com.brother.support.service.LoginService;
import com.brother.support.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Desc
 * @reason
 */
@Controller
@RequestMapping("login_info")
public class LoginController {
    @Autowired
    private LoginService loginService;


    @RequestMapping("/enterLogin")
    public String enterLoginPage(Model model) {
        model.addAttribute("sss", "111");
        return "login";
    }

    @RequestMapping("/check")
    public String checkUserInfo( UserInfo userInfo,Model model) {
        try {
            loginService.checkUserInfo(userInfo);
        } catch (Exception e) {
            String message = e.getMessage();
            model.addAttribute("error", message);
            return "error";
        }
        return "main";
    }








}
