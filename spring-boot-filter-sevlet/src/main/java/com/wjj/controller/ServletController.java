package com.wjj.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.net.http.HttpRequest;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */
@RestController
@RequestMapping("api")
public class ServletController {

    @GetMapping("request")
    public void testquest(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        request.setAttribute("wjj","20");
        request.setAttribute("wjj","21");
        request.removeAttribute("wjj");
    }

}
