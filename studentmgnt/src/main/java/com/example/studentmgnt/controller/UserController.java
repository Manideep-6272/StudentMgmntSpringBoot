package com.example.studentmgnt.controller;


import com.example.studentmgnt.entities.User;
import com.example.studentmgnt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/login")
    public boolean login(@RequestBody User user){
        return userService.findUser(user);
    }

    @PostMapping("/register")
    public void register(@RequestBody User user){
        userService.register(user);
    }
}
