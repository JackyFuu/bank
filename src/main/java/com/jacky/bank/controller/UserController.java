package com.jacky.bank.controller;

import com.jacky.bank.model.Result;
import com.jacky.bank.model.User;
import com.jacky.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author jacky
 */

@Controller //标识其为一个可接收 HTTP 请求的控制器
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * @author jacky
     * @date 2020/4/12 10:44
     * @discription 登录
     * @param username password
     * @return
     */
    @RequestMapping(value="/login")
    public String login(@RequestParam("username")String username, @RequestParam("password") String password, HttpSession session){
        Result result = userService.login(username, password);
        session.setAttribute("result", result);
        return "redirect:/index";
    }

    @RequestMapping(value = "/register")
    public String register(User user, HttpSession session){
        Result result = userService.register(user);
        session.setAttribute("result", result);
        return "redirect:/toLogin";
    }
    /**
     * @author jacky
     * @date 2020/4/13 10:39
     * @discription 获取用户信息
     * @param userId
     * @return User
     */
    @RequestMapping(value="/getProfiles")
    public String getProfiles(@RequestParam("userId")String userId, Model model) {
        Result result = userService.getProfiles(userId);
        model.addAttribute("result", result);
        return "profiles";

    }



    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.removeAttribute("result");
        return "redirect:/index";
    }

    @RequestMapping("/success")
    public String success(Model model){
        model.addAttribute("hello", "你好");
        return "success";
    }


}
