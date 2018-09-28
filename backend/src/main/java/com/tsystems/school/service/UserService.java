package com.tsystems.school.service;

import com.tsystems.school.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    void saveUser(User user);

    Optional<User> findUserById(Long id);

    Iterable<User> findAllUsers();
}
