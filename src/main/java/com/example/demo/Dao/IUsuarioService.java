package com.example.demo.Dao;

import com.example.demo.models.Usuario;

import java.util.List;

public interface IUsuarioService {

    Usuario findById(int codigo);
    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    void delete(Usuario usuario);
    Usuario findByNombre(String nombre);

    Usuario findByCorreo(String correo);
}
