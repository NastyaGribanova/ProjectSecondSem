package ru.itis.mushroomnasya.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import ru.itis.mushroomnasya.models.UserSessionData;
import ru.itis.mushroomnasya.security.UserDetailsImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class UserHandler implements AuthenticationSuccessHandler {

    @Autowired
    UserSessionData userSessionData;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        userSessionData.setUserEmail((((UserDetailsImpl) authentication.getPrincipal()).getUser()).getEmail());
        userSessionData.setUserName((((UserDetailsImpl) authentication.getPrincipal()).getUser()).getName());
    }
}
