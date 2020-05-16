package ru.itis.mushroomnasya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import ru.itis.mushroomnasya.models.State;
import ru.itis.mushroomnasya.models.User;
import ru.itis.mushroomnasya.repositories.UsersRepository;

import java.util.Optional;

@Service
@SessionScope
public class ConfirmServiceImpl implements ConfirmService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public boolean confirm(String confirmCode) {
        Optional<User> userOptional = usersRepository.findByConfirmCode(confirmCode);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setState(State.CONFIRMED);
            usersRepository.save(user);
            return true;
        }
        return false;
    }
}
