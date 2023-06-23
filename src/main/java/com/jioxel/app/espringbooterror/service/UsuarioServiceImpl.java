package com.jioxel.app.espringbooterror.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jioxel.app.espringbooterror.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
     private List<Usuario> lista;
     
     public UsuarioServiceImpl() {
          this.lista = new ArrayList<>();
          this.lista.add(new Usuario(1,"Jovany","Sanchez"));
          this.lista.add(new Usuario(2,"Eliseo","b"));
          this.lista.add(new Usuario(3,"Luis","c"));
          this.lista.add(new Usuario(4,"Andres","d"));
          this.lista.add(new Usuario(5,"Camacho","e"));
          this.lista.add(new Usuario(6,"Random","f"));
          this.lista.add(new Usuario(7,"Alivas","g"));
     }

     @Override
     public List<Usuario> listar() {
          return lista;
     }

     @Override
     public Usuario obtenerPorId(Integer id) {
          // TODO Auto-generated method stub
          Usuario resultado = null;
          for(Usuario u: this.lista){
               if(u.getId().equals(id)){
                    resultado = u;
                    break;
               }
          }
          return resultado;
     }

     @Override
     public Optional<Usuario> obtenerPorIdOptional(Integer id) {
          Usuario usuario =this.obtenerPorId(id);
          return Optional.ofNullable(usuario);
     }
     
}
