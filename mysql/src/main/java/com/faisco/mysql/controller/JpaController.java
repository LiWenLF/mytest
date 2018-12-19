package com.faisco.mysql.controller;

import com.faisco.mysql.pojo.User;
import com.faisco.mysql.repository.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa")
public class JpaController {

    @Autowired
    private JpaUserRepository jpaUserRepository;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser(Long id) {
        User user = jpaUserRepository.findById(id).get();
        return user;
    }
}
