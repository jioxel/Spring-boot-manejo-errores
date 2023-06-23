package com.jioxel.app.espringbooterror.service;

import java.util.List;
import java.util.Optional;

import com.jioxel.app.espringbooterror.models.domain.Usuario;

public interface UsuarioService {
     public List<Usuario> listar();
     public Usuario obtenerPorId(Integer id);
     public Optional<Usuario> obtenerPorIdOptional(Integer id);
}
