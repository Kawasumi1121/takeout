package com.example.takeout.Menue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Menue {

    @RequestMapping("/")
    public String index() {
        return "Menue/index";
    }
}