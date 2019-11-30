package com.sqf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client2Controller {

    @RequestMapping("test2")
    public String testClient2(){

        return "我调用了Client2";
    }

}
