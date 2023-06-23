package com.jioxel.app.espringbooterror.models.domain;

public class Usuario {
     private Integer id;
     public Integer getId() {
          return id;
     }
     public void setId(Integer id) {
          this.id = id;
     }
     private String nombre;
     public String getNombre() {
          return nombre;
     }
     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
     private String apellido;
     public Usuario() {
     }
     public Usuario(Integer id, String nombre, String apellido) {
          this.id = id;
          this.nombre = nombre;
          this.apellido = apellido;
     }
     public String getApellido() {
          return apellido;
     }
     public void setApellido(String apellido) {
          this.apellido = apellido;
     }

}
