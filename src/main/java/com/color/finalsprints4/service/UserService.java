package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.model.User;
import com.color.finalsprints4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User getUserById(Long id){
        Optional<User> result = userRepository.findById(id);

        if (result.isPresent()) {
            return result.get();
        }

        return null;
    }

    public User addUser(User newUser) {
        return userRepository.save(newUser);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }

    public User updateUser(Long id, User updatedUser) {
        User userToUpdate = getUserById(id);

       userToUpdate.setId(updatedUser.getId());
       userToUpdate.setUserName(updatedUser.getUserName());
       userToUpdate.setFirstName(updatedUser.getFirstName());
       userToUpdate.setLastName(updatedUser.getLastName());
       userToUpdate.setSelectedColor(updatedUser.getSelectedColor());

        return userRepository.save(userToUpdate);

    }
}
