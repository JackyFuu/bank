package com.jacky.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author jacky
 * @time 2020-04-26 14:26
 * @discription thymeleaf方式必须经过控制器
 */

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/toLogin")
    public String toLogin(){ return "login"; }

    @GetMapping("/toRegister")
    public String toRegister(){ return "registration"; }

    @GetMapping("/toAbout")
    public String toAbout(){
        return "about";
    }

    @GetMapping("/toExchange")
    public String toExchange(){
        return "exchange";
    }

    @GetMapping("/toFaq")
    public String toFaq(){
        return "faq";
    }

    @GetMapping("/toPrivacy")
    public String toPrivacy(){
        return "privacy";
    }

    @GetMapping("/toContact")
    public String toContact(){
        return "contact";
    }


}
