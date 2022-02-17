package ru.moskovka.socnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SignupController {
    @GetMapping("/signup")
    public String showSignUpPage(@ModelAttribute("user") User user){
        return "signup/signup";
    }
}
