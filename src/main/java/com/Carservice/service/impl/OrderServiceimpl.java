package com.Carservice.service.impl;

import com.Carservice.model.Order;
import com.Carservice.repository.OrderRepository;
import com.Carservice.service.interf.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class OrderServiceimpl extends AbstractCRUDService<Order, Integer> implements OrderService {


    @Autowired
    OrderRepository orderRepository;

    @Override
    CrudRepository<Order, Integer> getRepository() {
        return orderRepository;
    }

    @Override
    public void create(Order object) {
        object.setCreationTime(new Date());
        if(timeInDiscountRange(object.getCreationTime())){
            object.setPrice(calculatorPrice() * 0.9);
        }
        else object.setPrice(calculatorPrice());
        super.create(object);
    }

    private double calculatorPrice(){
        return 5;
    }

    private boolean timeInDiscountRange(Date time){
        return true;
    }

}
