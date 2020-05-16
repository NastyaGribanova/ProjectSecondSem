package ru.itis.mushroomnasya.service;

import ru.itis.mushroomnasya.dto.ShowDto;
import ru.itis.mushroomnasya.models.Genre;

import java.util.List;

public interface AdminService {
    boolean addShow(ShowDto form);
    List<Genre> getAllGenres();
}
