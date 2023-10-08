package com.example.test.controller;

import com.example.test.service.imp.TestServiceImp;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestServiceImp testServiceImp;
    @GetMapping("/test99")
    public String test99(){
        return testServiceImp.print99();
    }
}
