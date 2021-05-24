package com.itheima.controller;

import com.itheima.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @ResponseBody
    @PostMapping("/user")
    public String add(User user){
        System.out.println("添加用户：" + user);
        return "add user success~";
    }

    @ResponseBody
    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") int id){
        System.out.println("删除用户：" + id);
        return "delete user success~";
    }

    @ResponseBody
    @PutMapping("/user")
    public String update(User user){
        System.out.println("更新用户：" + user);
        return "update user success~";
    }

    @ResponseBody
    @GetMapping("/user/{id}")
    public String update(@PathVariable("id") int id){
        System.out.println("根据id查询用户：" + id);
        return "get user success~";
    }
}
