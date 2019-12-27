package com.example.security;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String getME(){

        return "<h1>Hello Peopleeesss ssss</h1>";
    }

    @RequestMapping("/user")
    public String user(){

        return "<h1>Hello Guysssssss</h1>";
    }
    @RequestMapping("/admin")
    public String admin(){

        return "<h1>Hello Guyssssss</h1>";
    }

}
