package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
    @Column
    private String nombre;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String codigo;
    @Column
    private String correo;

    public Usuario(String nombre, String codigo, String correo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correo = correo;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
