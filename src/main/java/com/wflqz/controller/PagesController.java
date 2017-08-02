package com.wflqz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/page")
public class PagesController {

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    public String users(){
        return "forward:/pages/users/userlist.html";
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public String dept(){
        return "forward:/pages/dept/dept.html";
    }
}
