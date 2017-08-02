package com.wflqz.controller;

import com.wflqz.model.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

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

    @ResponseBody
    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public Object doLogin(HttpServletRequest request, HttpServletResponse response, SysUser user){
        Map<String, String > map = new HashMap<String, String>();

        return map;
    }
}
