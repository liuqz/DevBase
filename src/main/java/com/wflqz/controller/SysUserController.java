package com.wflqz.controller;

import com.wflqz.dao.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class SysUserController {

    @Autowired
    private SysUserDao dao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object findAll() {
        return dao.findAll();
    }
}
