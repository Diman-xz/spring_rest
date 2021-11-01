package com.example.spring_rest.service;

import com.example.spring_rest.model.Role;
import com.example.spring_rest.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRole(String role) {
        return roleRepository.getRoleByName(role);
    }

    @Override
    public void addRole(Role role) {
        roleRepository.save(role);
    }
}
