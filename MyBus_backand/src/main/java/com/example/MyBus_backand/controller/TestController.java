package com.example.MyBus_backand.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Peter Huang
 * @date 2022/11/22 16:45
 **/
@RestController
public class TestController {
    @RequestMapping("/HelloWorld")
    public String HelloWorld(){
        return "HelloWorld";
    }
}
