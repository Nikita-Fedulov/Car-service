package com.Carservice.controller.mvc;

import com.Carservice.model.Role;
import com.Carservice.model.Services;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(ServicesController.SERVICES_URL)
public class ServicesController extends CRUDController<Services, Integer>{


    public static final String SERVICES_URL = "ui/services";
    public static final String ROLE_NAME = "services";

    @Override
    String getEntityName() {
        return ROLE_NAME;
    }
}
