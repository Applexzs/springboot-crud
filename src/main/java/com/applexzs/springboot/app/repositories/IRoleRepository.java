package com.applexzs.springboot.app.repositories;

import com.applexzs.springboot.app.entities.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IRoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
