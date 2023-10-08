package com.pessoal.email.email;

public record DadosEmailCriado (String from, String tp, String subject, String text) {

    public DadosEmailCriado(Email email) {
        this(email.getFrom(), email.getTo(), email.getSubject(), email.getText());
    }
}
