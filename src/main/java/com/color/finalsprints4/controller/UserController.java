package com.color.finalsprints4.controller;


import com.color.finalsprints4.model.User;
import com.color.finalsprints4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("newUser")
    public User newUser(@RequestBody User newUser) {
        return userService.addUser(newUser);
    }

    @DeleteMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
