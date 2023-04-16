package com.Carservice.service.impl;

import com.Carservice.model.Employee;
import com.Carservice.repository.EmployeeRepository;
import com.Carservice.service.interf.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimpl extends AbstractCRUDService<Employee, Integer> implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    CrudRepository<Employee, Integer> getRepository() {
        return employeeRepository;
    }
}

