package com.example.UserManager.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.UserManager.entities.User;

public interface UserRepositories extends CrudRepository<User, Integer> {

    public User findByName(String name);
}