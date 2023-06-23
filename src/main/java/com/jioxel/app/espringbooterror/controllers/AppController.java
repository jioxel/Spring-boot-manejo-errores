package com.jioxel.app.espringbooterror.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jioxel.app.espringbooterror.errors.UsuarioNoEncontradoException;
import com.jioxel.app.espringbooterror.models.domain.Usuario;
import com.jioxel.app.espringbooterror.service.UsuarioService;

@Controller
public class AppController {
     
     @Autowired
     private UsuarioService usuarioService;

     @GetMapping("/index")
     public String index(){
          // Integer value = 100/0;
          Integer valor =Integer.parseInt("100x");
          return "index";
     }

     @GetMapping("/ver/{id}")
     public String ver(@PathVariable Integer id, Model model){
          // Usuario usuario = usuarioService.obtenerPorId(id);
          // if(usuario == null){
          //      throw new UsuarioNoEncontradoException(id.toString());
          // }
          Usuario usuario = usuarioService.obtenerPorIdOptional(id).orElseThrow(() -> new UsuarioNoEncontradoException(id.toString()));
          model.addAttribute("usuario", usuario);
          model.addAttribute("title", "Detalle usuario: " + usuario.getNombre());
          return "ver";
     }
}
