package com.pessoal.email.controller;

import com.pessoal.email.email.DadosEmail;
import com.pessoal.email.email.DadosEmailCriado;
import com.pessoal.email.email.Email;
import com.pessoal.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send-email")
public class EmailController {

    @Autowired
    private EmailService service;

    @PostMapping
    public ResponseEntity<DadosEmailCriado> enviar(@RequestBody DadosEmail dados) {
        var email = new Email(dados);
        service.sendEmail(email);

        return ResponseEntity.ok(new DadosEmailCriado(email));
    }

}
