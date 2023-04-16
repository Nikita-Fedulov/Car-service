package com.Carservice.service.impl;

import com.Carservice.model.Order;
import com.Carservice.repository.OrderRepository;
import com.Carservice.service.interf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceimpl extends AbstractCRUDService<Order, Integer> implements OrderService {


    @Autowired
    OrderRepository orderRepository;

    @Override
    CrudRepository<Order, Integer> getRepository() {
        return orderRepository;
    }
}
