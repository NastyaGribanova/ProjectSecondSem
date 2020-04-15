package ru.itis.mushroomnasya.service;

import ru.itis.mushroomnasya.dto.UserDto;

import java.util.List;

public interface UsersService {
    List<UserDto> getUsers();

    UserDto getConcreteUser(Long userId);

    List<UserDto> search(String name);
}
