package com.banking.user_services.services;

import com.banking.user_services.entities.User;
import com.banking.user_services.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public Optional<List<User>> getAllUser(){
        return Optional.of(userRepository.findAll());
    }

}
