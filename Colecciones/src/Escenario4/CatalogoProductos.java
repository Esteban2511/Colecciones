package Escenario4;

import java.util.*;

public class CatalogoProductos {

    private HashMap<String, Producto> mapaProductos = new HashMap<>();

    private TreeSet<Producto> productosOrdenados =
            new TreeSet<>(Comparator.comparingDouble(Producto::getPrecio));

    public void insertarProducto(Producto p){
        mapaProductos.put(p.getCodigo(), p);
        productosOrdenados.add(p);
    }

    public Producto buscarProducto(String codigo){
        return mapaProductos.get(codigo);
    }

    public void mostrarProductosOrdenados(){

        for(Producto p : productosOrdenados){
            System.out.println(p);
        }
    }
}