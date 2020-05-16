package ru.itis.mushroomnasya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.mushroomnasya.models.Show;
import ru.itis.mushroomnasya.repositories.ShowRepository;
import ru.itis.mushroomnasya.repositories.UsersRepository;
import ru.itis.mushroomnasya.security.UserDetailsImpl;
import ru.itis.mushroomnasya.service.ShowService;

@Controller
public class ShowsController {

    @Autowired
    ShowRepository showRepository;

    @Autowired
    UsersRepository userRepository;

    @Autowired
    ShowService showService;

    @GetMapping("/shows")
    public String getAdminPage(Authentication authentication, Model model) {
        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        model.addAttribute("shows", showService.getShowList(userDetails.getUser().getShowList()));
        model.addAttribute("user", userDetails.getUser());
        for(Show show: showService.getShowList(userDetails.getUser().getShowList())){
            System.out.println(show.getName());
        }
        return "shows";
    }

    @PostMapping("/shows")
    public String add(Authentication authentication, @RequestParam("show_id")String idShow) {
        UserDetailsImpl userDetails = (UserDetailsImpl)authentication.getPrincipal();
        userDetails.getUser().getShowList().add(showRepository.findByIdShow(Integer.parseInt(idShow)));

        userRepository.save(userDetails.getUser());
        return "redirect:/shows";
    }
}
