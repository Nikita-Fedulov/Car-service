package com.Carservice.controller.rest;


import com.Carservice.model.Employee;
import com.Carservice.service.interf.CRUDService;
import com.Carservice.service.interf.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EmployeeRestController.EMPLOYEE_REST_URL)
public class EmployeeRestController extends CRUDRestController<Employee, Integer> {

    public static final String EMPLOYEE_REST_URL = "employee";
    @Autowired
    private EmployeeService employeeService;

    @Override
    CRUDService<Employee, Integer> getService() {
        return employeeService;
    }
}