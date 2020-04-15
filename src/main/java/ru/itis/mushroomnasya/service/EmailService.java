package ru.itis.mushroomnasya.service;

public interface EmailService {
    void sendMail(String subject, String text, String email);
}
