package com.example.demo.controller;

import com.example.demo.Dao.IUsuarioService;
import com.example.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    IUsuarioService usuarioService;

    @GetMapping(value = "/getAll")
    public List<Usuario> getMappingMethod(){

        return usuarioService.findAll();


    }


    @GetMapping(value = "/getUsuario/{codigo}")
    public Usuario getMappingMethod(@PathVariable int codigo){

        return usuarioService.findById(codigo);

    }


    @GetMapping(value = "/getUsuarioByNombre/{nombre}")
    public Usuario getNombreMappingMethod(@PathVariable String nombre){

        return usuarioService.findByNombre(nombre);

    }

    @PostMapping(value = "/save")
    public Usuario getPostMappingMethod(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping(value = "/update")
    public Usuario getPutMappingMethod(@RequestBody Usuario usuarioDelRequest){

        Usuario usuarioDeLaBase = usuarioService.findByCorreo(usuarioDelRequest.getCorreo());
        if(null != usuarioDeLaBase)
        {
            usuarioDeLaBase.setCorreo(usuarioDelRequest.getCorreo());
            usuarioDeLaBase.setNombre(usuarioDelRequest.getNombre());
            usuarioDeLaBase.setCodigo(usuarioDelRequest.getCodigo());
        }
        return usuarioService.save(usuarioDeLaBase);
    }

    @DeleteMapping(value = "/deleteUsuario/{id}")
    public String getDeleteMappingMethod(@PathVariable int id)
    {
        Usuario usuario =usuarioService.findById(id);
        usuarioService.delete(usuario);
        return "El Usuario ya se fue a la verga ";
    }

}
