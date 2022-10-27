package com.operez.apipruebaspringboot.repository;

import com.operez.apipruebaspringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserById(Integer id);
}
