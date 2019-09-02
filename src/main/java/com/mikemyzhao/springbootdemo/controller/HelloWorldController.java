package com.mikemyzhao.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/2 14:06
 * @Description:
 */
@Controller
public class HelloWorldController {
    @ResponseBody
    @RequestMapping("helloWorld")
    public String helloWorld(){
        return "Hello World,SpringBoot";
    }
}
