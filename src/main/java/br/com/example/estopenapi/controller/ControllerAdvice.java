package br.com.example.estopenapi.controller;

import br.com.example.estopenapi.exception.CustomException;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Hidden
public class ControllerAdvice {

    @ExceptionHandler(CustomException.class)
    @ResponseStatus
    public void handleRuntimeException(CustomException ex) {
        System.out.println("RuntimeException: " + ex.getMessage());
    }

}
