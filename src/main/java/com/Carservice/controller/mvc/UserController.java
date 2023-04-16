package com.Carservice.controller.mvc;

import com.Carservice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UserController.USER_URL)
public class UserController extends CRUDController<User, Integer> {


    public static final String USER_URL = "ui/user";
    public static final String ROLE_NAME = "user";

    @Override
    String getEntityName() {
        return ROLE_NAME;
    }
}
