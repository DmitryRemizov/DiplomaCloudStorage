package ru.netology.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 *  @author Dmitry Remizov
 *  9.12.2023
 */

@Data
@AllArgsConstructor
public class AuthenticationRQ {

    @NotBlank(message = "login must not be null")
    private String login;

    @NotBlank(message = "password must not be null")
    private String password;
}