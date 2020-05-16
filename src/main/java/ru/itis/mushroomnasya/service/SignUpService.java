package ru.itis.mushroomnasya.service;

import ru.itis.mushroomnasya.dto.SignUpDto;

public interface SignUpService {
    boolean signUp(SignUpDto form);
}
