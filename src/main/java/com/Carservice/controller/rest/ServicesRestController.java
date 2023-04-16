package com.Carservice.controller.rest;


import com.Carservice.model.Services;
import com.Carservice.service.interf.CRUDService;
import com.Carservice.service.interf.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ServicesRestController.SERVICES_REST_URL)
public class ServicesRestController extends CRUDRestController<Services, Integer> {

    public static final String SERVICES_REST_URL = "services";
    @Autowired
    private ServiceService servicesService;

    @Override
    CRUDService<Services, Integer> getService() {
        return servicesService;
    }
}
