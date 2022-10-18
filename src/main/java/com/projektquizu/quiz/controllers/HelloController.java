package com.projektquizu.quiz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(Model model){

        model.addAttribute("message", "message 2");
        return "index";
    }
}
