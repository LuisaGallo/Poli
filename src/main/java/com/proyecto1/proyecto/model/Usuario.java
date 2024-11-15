package com.proyecto1.proyecto.model;

public class Usuario {
    private Integer idUser;
    private String nombre;
    private String apellidos;
    public Usuario(Integer idUser, String nombre, String apellidos) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    

    public Integer getIdUser() {
        return idUser;
    }
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    

}
