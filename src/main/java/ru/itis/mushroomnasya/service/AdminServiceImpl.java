package ru.itis.mushroomnasya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import ru.itis.mushroomnasya.dto.ShowDto;
import ru.itis.mushroomnasya.models.Genre;
import ru.itis.mushroomnasya.models.Show;
import ru.itis.mushroomnasya.repositories.ShowRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@ApplicationScope
public class AdminServiceImpl implements AdminService {

    @Autowired
    private ShowRepository showRepository;

    @Override
    public boolean addShow(ShowDto form) {
        Show show = Show.builder()
                .name(form.getName())
                .genre(Genre.valueOf(form.getGenre()))
                .country(form.getCountry())
                .build();
        showRepository.save(show);
        return true;
    }

    public List<Genre> getAllGenres(){
        List<Genre> genres = new ArrayList<Genre>(Arrays.asList(Genre.values()));
        return genres;
    }
}
