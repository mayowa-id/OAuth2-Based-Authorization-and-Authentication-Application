package com.example.oauth2_resource_server;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {
    @GetMapping("/public")
    public String homePage(){
        return "Yo, Hello hope you're good!";
    }
    @GetMapping("/private")
    public String privateRoute(){
        return "Private Route";
    }

}
