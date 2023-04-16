package com.Carservice.controller.rest;

import com.Carservice.service.interf.CRUDService;
import com.Carservice.service.interf.RoleService;
import com.Carservice.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RoleRestController.ROLE_REST_URL)
public class RoleRestController extends CRUDRestController <Role, Integer>{

    public static final String ROLE_REST_URL = "role";
    @Autowired
    private RoleService roleService;
    @Override
    CRUDService<Role, Integer> getService() {
        return roleService;
    }
}
