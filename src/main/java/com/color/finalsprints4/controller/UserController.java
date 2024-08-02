package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.User;
import com.color.finalsprints4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("newUser")
    public User newUser(@RequestBody User newUser) {
        System.out.println("Received request to create new user: " + newUser);
        return userService.addUser(newUser);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        return userService.updateUser(id, updatedUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Test endpoint is working!";
    }

}
