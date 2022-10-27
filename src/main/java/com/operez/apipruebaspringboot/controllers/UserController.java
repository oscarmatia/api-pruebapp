package com.operez.apipruebaspringboot.controllers;

import com.operez.apipruebaspringboot.entity.User;
import com.operez.apipruebaspringboot.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServices service;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service.SaveUser(user);
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return service.updateUser(user);
    }


}
