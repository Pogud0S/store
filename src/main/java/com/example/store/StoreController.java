package com.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StoreController {
    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/")
    String requestMapping(){
        System.out.println(name);
        return "index.html";
    }
}
