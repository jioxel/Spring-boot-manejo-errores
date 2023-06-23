package com.jioxel.app.espringbooterror.errors;

public class UsuarioNoEncontradoException extends RuntimeException{
     public UsuarioNoEncontradoException(String id){
          super("Usuario con ID: ".concat(id).concat(". No existe en el sistema"));
     }
}
