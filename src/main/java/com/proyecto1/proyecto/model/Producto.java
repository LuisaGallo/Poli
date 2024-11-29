package com.proyecto1.proyecto.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {
    private Integer id;
    private String nombre;
    private int valor;
    private Integer cantidad;
}
