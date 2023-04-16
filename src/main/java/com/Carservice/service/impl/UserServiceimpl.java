package com.Carservice.service.impl;

import com.Carservice.model.User;
import com.Carservice.repository.UserRepository;
import com.Carservice.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl extends AbstractCRUDService<User, Integer> implements UserService {


    @Autowired
    UserRepository userRepository;

    @Override
    CrudRepository<User, Integer> getRepository() {
        return userRepository;
    }
}
