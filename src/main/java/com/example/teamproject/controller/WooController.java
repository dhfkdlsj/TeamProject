package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class WooController {

    @GetMapping("/woo")
    public @ResponseBody String woo() {
        return "hello woo!";
    }    
}
