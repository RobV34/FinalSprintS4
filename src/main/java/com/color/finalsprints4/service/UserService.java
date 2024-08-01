package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.model.User;
import com.color.finalsprints4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User addUser(User newUser) {
        return userRepository.save(newUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }
}
