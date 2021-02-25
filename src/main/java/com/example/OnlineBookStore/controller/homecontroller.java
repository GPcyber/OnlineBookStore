package com.example.OnlineBookStore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class homecontroller {

    @GetMapping("/home")
    public String gethome() throws Exception
    {
        return "home" ;
    }

    @GetMapping("/login")
    public String getLogin( @RequestParam (required = false) String type) throws Exception
    {
        if (type == null)
        {
            return "401.html";
        }

        else
        {
          if (type.equals("admin"))
           {
            return "adminloginpage.html";
           }
          else
            {
             return "userloginpage.html";
            }
        }
    }
}


