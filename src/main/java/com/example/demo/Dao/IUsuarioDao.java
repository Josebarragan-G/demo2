package com.example.demo.Dao;

import com.example.demo.models.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface IUsuarioDao extends CrudRepository<Usuario,Integer> {


    Usuario findById(int codigo);
    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    void delete(Usuario usuario);
    Usuario findByNombre(String nombre);
    Usuario findByCorreo(String correo);



}


