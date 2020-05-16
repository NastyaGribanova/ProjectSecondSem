package ru.itis.mushroomnasya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.itis.mushroomnasya.dto.UserDto;
import ru.itis.mushroomnasya.models.User;
import ru.itis.mushroomnasya.repositories.UsersRepository;

import java.time.LocalDateTime;
import java.util.List;

import static ru.itis.mushroomnasya.dto.UserDto.from;

@Service
@Scope("scope")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<UserDto> getUsers() {
        return from(usersRepository.findAll());
    }

    @Override
    public UserDto getConcreteUser(Long userId) {
        User user = usersRepository.getOne(userId);
        return from(user);
    }

    @Override
    public List<UserDto> search(String name) {
        return from(usersRepository.findAllByNameContainsIgnoreCase(name));
    }

}
