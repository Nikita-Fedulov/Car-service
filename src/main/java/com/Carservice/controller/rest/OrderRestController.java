package com.Carservice.controller.rest;

import com.Carservice.model.Order;
import com.Carservice.service.interf.CRUDService;
import com.Carservice.service.interf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(OrderRestController.ORDER_REST_URL)
public class OrderRestController extends CRUDRestController<Order, Integer> {

    public static final String ORDER_REST_URL = "order";
    @Autowired
    private OrderService orderService;

    @Override
    CRUDService<Order, Integer> getService() {
        return orderService;
    }
}
