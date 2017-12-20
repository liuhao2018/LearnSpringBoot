package com.example.demo.web;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuhao
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public User saveUser(@RequestParam String name){
        User user = userServiceImpl.saveOnme(name);
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        User user = userServiceImpl.findOne(id);
        return user;
    }
}
