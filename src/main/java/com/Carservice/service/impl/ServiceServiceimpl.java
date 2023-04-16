package com.Carservice.service.impl;

import com.Carservice.model.Services;
import com.Carservice.repository.ServicesRepository;
import com.Carservice.service.interf.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceServiceimpl extends AbstractCRUDService<Services, Integer> implements ServiceService {


    @Autowired
    ServicesRepository serviceRepository;

    @Override
    CrudRepository<Services, Integer> getRepository() {
        return serviceRepository;
    }
}
