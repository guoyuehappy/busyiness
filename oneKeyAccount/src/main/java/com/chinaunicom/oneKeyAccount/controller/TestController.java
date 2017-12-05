package com.chinaunicom.oneKeyAccount.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/hello")
@Controller
public class TestController {
    @RequestMapping("/{name}")
    @ResponseBody
    public  String getWord(@PathVariable("name") String name) {

        return "hello"+name;
    }

    @RequestMapping("/jsp")
    public String toJspPage(){
        return "index";
    }
}
