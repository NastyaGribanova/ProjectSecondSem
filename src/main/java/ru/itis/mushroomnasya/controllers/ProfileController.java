package ru.itis.mushroomnasya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.mushroomnasya.security.UserDetailsImpl;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String getProfile(Authentication authentication, Model model) {
        if (authentication != null){
            UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
            model.addAttribute("user", userDetails.getUser());
            return "profile";
        } else return "redirect:/sign_in";
    }

}
