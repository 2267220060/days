package com.sqf.controller;

import com.sqf.api.TestClient1Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient2Controller {
    @Autowired
    TestClient1Api testClient1Api;

    @RequestMapping("test1")
    public String testClient2(){
        String s = testClient1Api.test01();

        return "s";
    }


}
