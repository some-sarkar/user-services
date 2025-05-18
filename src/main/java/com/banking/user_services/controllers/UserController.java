package com.banking.user_services.controllers;

import com.banking.user_services.entities.User;
import com.banking.user_services.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add-user")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/get-all-users")
    public ResponseEntity<List<User>> getAllUsers(){

        return new ResponseEntity<>(userService.getAllUser().orElse(null), HttpStatus.OK);

    }
}
