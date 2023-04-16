package com.Carservice.controller.mvc;

import com.Carservice.model.Order;
import com.Carservice.model.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(OrderController.ORDER_URL)
public class OrderController extends CRUDController<Order, Integer>{


    public static final String ORDER_URL = "ui/order";
    public static final String ROLE_NAME = "order";

    @Override
    String getEntityName() {
        return ROLE_NAME;
    }
}
