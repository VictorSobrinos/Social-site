package com.SocialSite.mainService.controller.impl;


import com.SocialSite.mainService.model.User;
import com.SocialSite.mainService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @PostMapping("/user")
    public void saveUser(@RequestBody User user){
        userRepository.save(user);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users;
        users = userRepository.findAll();
        return users;
    }
}
