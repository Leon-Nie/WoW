package com.wow.tast.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class LoginController {


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String Login(){

        log.info("successfully");
        return "login";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String User(){

        log.info("successfully");
        return "userResult";
    }
}
