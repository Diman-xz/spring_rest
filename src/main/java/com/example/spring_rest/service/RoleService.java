package com.example.spring_rest.service;

import com.example.spring_rest.model.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    Role getRole(String role);

    void addRole(Role role);
}
