package ru.itis.mushroomnasya.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.itis.mushroomnasya.models.PageData;

@Controller
public class RoomsController {

    @Autowired
    private PageData pageData;

    @RequestMapping("/rooms/{room-id}")
    public String rooms(@PathVariable("room-id") String id, Model model) {
        int count = pageData.getCount();
        pageData.onVisit();
        model.addAttribute("room_id", id);
        model.addAttribute("count", count);
        return "room";
    }

}
