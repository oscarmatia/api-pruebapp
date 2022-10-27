package com.operez.apipruebaspringboot.service;


import com.operez.apipruebaspringboot.entity.User;
import com.operez.apipruebaspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepository repository;

    public List<User> getUsers(){
        return repository.findAll();
    }
    public User SaveUser(User user){
        return repository.save(user);
    }
    public String deleteUser(Integer id){
        repository.deleteById(id);
        return "user removed" + id;
    }
    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setCorreo(user.getCorreo());
        existingUser.setTipo_deporte(user.getTipo_deporte());
        return repository.save(existingUser);
    }

}
