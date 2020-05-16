package ru.itis.mushroomnasya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.mushroomnasya.dto.ShowDto;
import ru.itis.mushroomnasya.dto.SignUpDto;
import ru.itis.mushroomnasya.models.Genre;
import ru.itis.mushroomnasya.repositories.ShowRepository;
import ru.itis.mushroomnasya.service.AdminService;
import ru.itis.mushroomnasya.service.SignUpService;

@Controller
public class AdminController {

    @Autowired
    private AdminService service;

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/admin")
    public String getAdminPage(Model model) {
        model.addAttribute("genres", service.getAllGenres());
        return "admin";
    }

    @PostMapping("/admin")
    public String addShow(ShowDto form) {
        if(service.addShow(form)) {
            return "redirect:/shows";
        } else return "admin";
    }
}
