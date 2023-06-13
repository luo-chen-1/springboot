package com.wjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */

@Controller
@RequestMapping(value = "api")
public class InterceptorController {

    @GetMapping("login")
    public String indexPage(Model model){
        model.addAttribute("msg","Spring 拦截器学习");
        return "index";
    }

    @GetMapping("hello")
    @ResponseBody
    public String getHello(){
        return "hello world";
    }

}
