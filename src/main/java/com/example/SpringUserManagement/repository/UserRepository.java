package com.example.SpringUserManagement.repository;

import com.example.SpringUserManagement.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByUsername(String userName);

    User findByEmail(String email);
}
