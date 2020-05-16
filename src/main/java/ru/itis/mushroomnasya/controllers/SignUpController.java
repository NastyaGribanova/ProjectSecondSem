package ru.itis.mushroomnasya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.mushroomnasya.dto.SignUpDto;
import ru.itis.mushroomnasya.service.SignUpService;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService service;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign_up";
    }

    @PostMapping("/signUp")
    public String signUp(SignUpDto form) {
        if(service.signUp(form)) {
            return "redirect:/signIn";
        } else return "sign_up";
    }
}
