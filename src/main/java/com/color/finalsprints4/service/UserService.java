package com.color.finalsprints4.service;

import com.color.finalsprints4.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return List.of();
    }

    public User addUser(User newUser) {
        return newUser;
    }

    public void deleteUser(Long id) {

    }
}
