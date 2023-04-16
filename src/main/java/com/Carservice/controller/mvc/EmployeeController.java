package com.Carservice.controller.mvc;

import com.Carservice.model.Employee;
import com.Carservice.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(EmployeeController.EMPLOYEE_URL)
public class EmployeeController extends CRUDController<Employee, Integer>{


    public static final String EMPLOYEE_URL = "ui/employee";
    public static final String ROLE_NAME = "employee";

    @Override
    String getEntityName() {
        return ROLE_NAME;
    }
}
