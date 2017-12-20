package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liuhao
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService {


    @Autowired
    private UserRepository userRepository;



    @Override
    public User findOne(Long id) {
        User user = userRepository.findOne(id);
        return user;
    }

    @Override
    public User saveOnme(String name) {
        User user = new User();
        user.setName(name);
        User u = userRepository.save(user);
        return u;
    }

}
