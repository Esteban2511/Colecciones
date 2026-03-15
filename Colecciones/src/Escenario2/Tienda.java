package Escenario2;

import java.util.*;

public class Tienda {

    static HashMap<String, Producto> productosPorCodigo = new HashMap<>();
    static TreeSet<Producto> productosOrdenados = new TreeSet<>(Comparator.comparingDouble(p -> p.precio));
    static HashMap<String, List<Producto>> productosPorCategoria = new HashMap<>();


    public static void insertarProducto(Producto p) {
        productosPorCodigo.put(p.codigo, p);
        productosOrdenados.add(p);
        productosPorCategoria
                .computeIfAbsent(p.categoria, k -> new ArrayList<>())
                .add(p);
    }

    public static Producto buscarProducto(String codigo) {
        return productosPorCodigo.get(codigo);
    }
    public List<Producto> filtrarCategoria(String categoria) {
        return productosPorCategoria.getOrDefault(categoria, new ArrayList<>());
    }

    public void mostrarOrdenadosPorPrecio() {
        for (Producto p : productosOrdenados) {
            System.out.println(p);
        }
    }

}
