package ru.netology.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *  @author Dmitry Remizov
 *  9.12.2023
 */

@Data
@AllArgsConstructor
public class ExceptionRS {

    private String message;
    private Integer id;
}