package com.springmvc.service;

import com.springmvc.controller.UserController;
import com.springmvc.entity.User;
import com.springmvc.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        this.userRepository.save(user);
        logger.info("user service accessed.");
    }
}
