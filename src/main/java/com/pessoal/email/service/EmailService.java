package com.pessoal.email.service;

import com.pessoal.email.email.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender sender;

    public void sendEmail(Email email) {
        try {
            var simpleEmail = new SimpleMailMessage();

            simpleEmail.setTo(email.getTo());
            simpleEmail.setFrom(email.getFrom());
            simpleEmail.setSubject(email.getSubject());
            simpleEmail.setText(email.getText());
            sender.send(simpleEmail);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
