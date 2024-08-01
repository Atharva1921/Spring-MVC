package com.springmvc.controller;

import com.springmvc.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    @GetMapping("/register")
    public String register() {
        logger.info("Register accessed");
        System.out.println("register");
        return "register";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
