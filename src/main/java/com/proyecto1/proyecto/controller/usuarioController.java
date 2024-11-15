package com.proyecto1.proyecto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto1.proyecto.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
public class usuarioController {

    private List<Usuario> Usuarios = new ArrayList<>(
        Arrays.asList(new Usuario(123, "Luisa", "Gallo"))
    );

    @GetMapping("/users")
    public List<Usuario> getUsuario() {
        return Usuarios;
    }

    @GetMapping("/{nombre}")
    public Usuario getusesrid(@PathVariable String nombre) {
        for (Usuario u: Usuarios){
            if (u.getNombre().equalsIgnoreCase(nombre)){
                return u;
            }
        }
        return null;
    }
    
    @PostMapping("/usuario")
    public Usuario crearusuario(@RequestBody Usuario usuario) {
        Usuarios.add(usuario);
        
        return usuario;
    }
    
    

}
