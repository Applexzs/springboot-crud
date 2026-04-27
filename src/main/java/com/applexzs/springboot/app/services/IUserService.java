package com.applexzs.springboot.app.services;

import com.applexzs.springboot.app.entities.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    User save(User user);


}
