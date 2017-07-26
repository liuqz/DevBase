package com.wflqz.controller;

import com.wflqz.dao.SysDeptDao;
import com.wflqz.model.SysDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Vector;

@RestController
@RequestMapping(value = "/dept")
public class SysDeptController {

    @Autowired
    private SysDeptDao dao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object findAll(){
        return dao.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public Object saveOne(SysDept dept) {
        return dao.save(dept);
    }
}
