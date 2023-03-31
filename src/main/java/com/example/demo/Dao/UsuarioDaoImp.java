package com.example.demo.Dao;

import com.example.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioDaoImp implements IUsuarioService{

    @Autowired
    IUsuarioDao usuarioDao;

    @Override
    public Usuario findById(int codigo) {
        return usuarioDao.findById(codigo);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    public void delete(Usuario usuario) {
         usuarioDao.delete(usuario);
    }

    @Override
    public Usuario findByNombre(String nombre) {
        return usuarioDao.findByNombre(nombre);
    }

    @Override
    public Usuario findByCorreo(String correo) {
        return usuarioDao.findByCorreo(correo);
    }
}
