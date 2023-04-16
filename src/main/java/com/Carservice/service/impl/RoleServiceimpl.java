package com.Carservice.service.impl;

import com.Carservice.model.Role;
import com.Carservice.repository.RoleRepository;
import com.Carservice.service.interf.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceimpl extends AbstractCRUDService<Role, Integer> implements RoleService {


    @Autowired
    RoleRepository roleRepository;
    @Override
    CrudRepository<Role, Integer> getRepository() {
        return roleRepository;
    }
}
