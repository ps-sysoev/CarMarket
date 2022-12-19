package com.example.carmarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
    @GetMapping("/index")
    public ModelAndView begin(){
        return new ModelAndView("index");
    }
}
