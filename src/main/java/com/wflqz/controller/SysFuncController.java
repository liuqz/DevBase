package com.wflqz.controller;

import com.wflqz.dao.SysFuncDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("func")
public class SysFuncController {

    @Autowired
    private SysFuncDao dao;
}
