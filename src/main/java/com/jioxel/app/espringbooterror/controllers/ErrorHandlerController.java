package com.jioxel.app.espringbooterror.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jioxel.app.espringbooterror.errors.UsuarioNoEncontradoException;

@ControllerAdvice
public class ErrorHandlerController {
     
     @ExceptionHandler({ArithmeticException.class})
     public String rithmeticError(Exception ex, Model model){
          model.addAttribute("error", "Error de aritmetica");
          model.addAttribute("message", ex.getMessage());
          model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
          model.addAttribute("timestamp", new Date());

          return "error/aritmetica";
     }

     @ExceptionHandler({NumberFormatException.class})
     public String numberFormatError(Exception ex, Model model){
          model.addAttribute("error", "Formato numero invalido!");
          model.addAttribute("message", ex.getMessage());
          model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
          model.addAttribute("timestamp", new Date());

          return "error/numero-formato";
     }

     @ExceptionHandler({UsuarioNoEncontradoException.class})
     public String usuarioNoEncontrado(Exception ex, Model model){
          model.addAttribute("error", "Usuario no encontrado");
          model.addAttribute("message", ex.getMessage());
          model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
          model.addAttribute("timestamp", new Date());

          return "error/generica";
     }
}
