package com.Carservice.controller.rest;


import com.Carservice.model.User;
import com.Carservice.service.interf.CRUDService;
import com.Carservice.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserRestController.USER_REST_URL)
public class UserRestController extends CRUDRestController<User, Integer> {

    public static final String USER_REST_URL = "user";
    @Autowired
    private UserService userService;

    @Override
    CRUDService<User, Integer> getService() {
        return userService;
    }
}
