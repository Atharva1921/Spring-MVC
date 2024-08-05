package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/register")
    public String register( Model model) {
        logger.info("Register accessed");
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/processform")
    public String processForm(@Valid @ModelAttribute("user") User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            logger.warn("validation error");
            return "register";


        } else {
            this.userService.saveUser(user);
            logger.info(user);
            return "redirect:/user/login";
        }

    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
