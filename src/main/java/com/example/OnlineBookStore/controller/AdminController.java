package com.example.OnlineBookStore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/managebooks")
    public String manageBooks(){
        return "managebooks";
    }

    @GetMapping("/manageusers")
    public String manageUsers(){
        return "manageusers";
    }

    @GetMapping("/adminhomepage")
    public String adminHome(){
        return "adminhomepage";
    }
}
