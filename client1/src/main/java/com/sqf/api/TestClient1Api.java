package com.sqf.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="client2")
public interface TestClient1Api {

    @RequestMapping("test2")
    public String test01();

}
