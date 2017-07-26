package com.wflqz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SystemController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "forward:/pages/index/index.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "forward:/pages/login/login.html";
    }
}
