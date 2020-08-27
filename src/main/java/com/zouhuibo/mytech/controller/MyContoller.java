package com.zouhuibo.mytech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyContoller {

    @ResponseBody
    @GetMapping("/check")
    public String check() {
        return "success";
    }
}
