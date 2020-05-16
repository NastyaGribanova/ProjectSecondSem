package ru.itis.mushroomnasya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.mushroomnasya.dto.SignUpDto;

@Controller
public class SignInController {

    @GetMapping("/signIn")
    public String getSignIn() {
        return "sign_in";
    }

}
