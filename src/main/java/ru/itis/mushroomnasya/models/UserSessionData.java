package ru.itis.mushroomnasya.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Data
@Builder
@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserSessionData {
    String userName;
    String userEmail;
}
