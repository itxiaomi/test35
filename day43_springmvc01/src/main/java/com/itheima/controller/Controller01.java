package com.itheima.controller;

import com.itheima.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller01 {

    @ResponseBody
    @RequestMapping(value = "/controller01/test" , produces = "text/html;charset=utf-8")
    public String test(){
        System.out.println("执行了Controller01的test方法·...");

        return "中文";
    }

    @ResponseBody
    @RequestMapping(value = "/controller01/test2" )
    public User test2(){
        System.out.println("执行了Controller01的test方法·...");
        User user = new User(1,"张三","123456");
        return user;
    }
}
