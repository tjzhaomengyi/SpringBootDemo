package com.mikemyzhao.springbootdemo.controller;

import com.mikemyzhao.springbootdemo.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/3 11:58
 * @Description:
 */

@Controller
public class BootController {
    @ResponseBody
    @RequestMapping("/request")
    public String request(){
        return "hello spring boot";
    }


    @RequestMapping("/welcome")
    public String welcome(Map<String,Object> map){
        //给themleaf准备数据
        map.put("welcome","halo");
        List<Product> prods = new ArrayList<>();
        prods.add(new Product("a",100,10));
        prods.add(new Product("a",200,20));
        prods.add(new Product("a",300,30));
        map.put("prods",prods);
        return "result";
    }
}
