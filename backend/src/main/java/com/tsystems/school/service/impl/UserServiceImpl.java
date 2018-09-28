package com.tsystems.school.service.impl;

import com.tsystems.school.model.User;
import com.tsystems.school.repository.UserRepository;
import com.tsystems.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> findUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    @Override
    public Iterable<User> findAllUsers() {
        Iterable<User> users = userRepository.findAll();
        return users;
    }
}
