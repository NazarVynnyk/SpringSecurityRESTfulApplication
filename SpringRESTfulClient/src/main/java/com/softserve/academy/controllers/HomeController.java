package com.softserve.academy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/home", "/index"})
    public String homePage() {
        return "index";
    }
}