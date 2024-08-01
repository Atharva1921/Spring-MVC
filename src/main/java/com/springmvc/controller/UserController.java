package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
