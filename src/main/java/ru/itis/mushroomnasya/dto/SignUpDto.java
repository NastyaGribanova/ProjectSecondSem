package ru.itis.mushroomnasya.dto;

import lombok.Data;

@Data
public class SignUpDto {
    private String name;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
