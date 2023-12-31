package com.pessoal.email.email;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosEmail(

        @NotBlank
        @Email
        String from,
        @NotBlank
        @Email
        String to,
        @NotBlank
        String subject,
        @NotBlank
        String text
){

}
