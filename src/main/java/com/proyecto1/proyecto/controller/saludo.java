package com.proyecto1.proyecto.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class saludo {

   @GetMapping("/Hola")
    
    public String saludo(){
        return "Mi primer script";
    }

}
