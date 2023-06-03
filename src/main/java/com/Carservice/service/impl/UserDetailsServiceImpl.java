package com.Carservice.service.impl;

import com.Carservice.model.User;
import com.Carservice.repository.UserRepository;
import com.Carservice.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = loadUserOptionalByUsername(username);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("User not found!");
        }
        return new UserDetailsImpl(user.get());
    }

    public Optional<User> loadUserOptionalByUsername(String username) {
        return userRepository.findByUserName(username);
    }

}
