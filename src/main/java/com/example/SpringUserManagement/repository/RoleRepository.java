package com.example.SpringUserManagement.repository;


import com.example.SpringUserManagement.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {
    Role findByRole(String role);
}
