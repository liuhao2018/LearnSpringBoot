package com.example.demo.service;

import com.example.demo.model.User;

/**
 * @author liuhao
 */
public interface IUserService {
    /**
     * @param id
     * @return
     */
    User findOne(Long id);

    /**
     * @param name
     * @return
     */
    User saveOnme(String name);
}
