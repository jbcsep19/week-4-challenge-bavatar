package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage() {
        return "homepage";
    }

    @RequestMapping("/about")
    public String about() {
        return "aboutauthor";
    }

    @RequestMapping("/abstraction")
    public String abstraction() {
        return "abstraction";
    }

    @RequestMapping("/composition")
    public String composition() {
        return "composition";
    }

    @RequestMapping("/encapsulation")
    public String encapsulation() {
        return "encapsulation";
    }

    @RequestMapping("/github")
    public String github() {
        return "github";
    }

    @RequestMapping("/inheritance")
    public String inheritance() {
        return "inheritance";
    }

    @RequestMapping("/polymorphism")
    public String polymorphism() {
        return "polymorphism";
    }
}
