package com.pessoal.email.email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Email {

    private String from;
    private String to;
    private String subject;
    private String text;

    public Email(DadosEmail dados) {
        this.from = dados.from();
        this.to = dados.to();
        this.subject = dados.subject();
        this.text= dados.text();
    }
}
