package com.proyecto1.proyecto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto1.proyecto.model.Producto;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/Producto")
public class ProductoController {

    private List<Producto> productos = new ArrayList<>(
        Arrays.asList(new Producto(1, "Manzanas", 1000, 50))
    );

    @GetMapping("/productos")
    public List<Producto> getProductos() {
        return productos;
    }

    @GetMapping("/productos/{nombre}")
    public Producto getProductoPorNombre(@PathVariable String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
    
    @PostMapping("/productos")
    public Producto crearProducto(@RequestBody Producto producto) {
        productos.add(producto);
        return producto;
    }
    
    @PutMapping("/productos")
    public Producto actualizarProducto(@RequestBody Producto producto) {
        for (Producto p : productos) {
            if (p.getId().equals(producto.getId())) {
                p.setNombre(producto.getNombre());
                p.setValor(producto.getValor());
                p.setCantidad(producto.getCantidad());
                return p;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Producto eliminarProducto(@PathVariable int id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                productos.remove(p);
                return p;
            }
        }
        return null;
    }
}

