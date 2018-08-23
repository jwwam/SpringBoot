package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: FirstController
 * @Auther: zhangyingqi
 * @Date: 2018/8/23 17:53
 * @Description: 测试页面跳转
 */
@Controller
@RequestMapping(value="/first")
public class FirstController {

    @RequestMapping(value="/view")
    public String view(HttpServletRequest request){
        return "/demoPage/firstPage";
    }

}
