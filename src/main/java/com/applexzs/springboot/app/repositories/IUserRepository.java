package com.applexzs.springboot.app.repositories;

import com.applexzs.springboot.app.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {
}
