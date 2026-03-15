package Escenario2;

import java.util.*;

class Producto {
    String codigo;
    double precio;
    String categoria;

    public Producto(String codigo, double precio, String categoria) {
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return "Codigo: " + codigo +
                " | Precio: " + precio +
                " | Categoria: " + categoria;
    }
}