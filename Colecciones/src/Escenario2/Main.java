package Escenario2;

public class Main {

    public static void main(String[] args) {

        Tienda plataforma = new Tienda();

        plataforma.insertarProducto(new Producto("P01", 1200, "Tecnologia"));
        plataforma.insertarProducto(new Producto("P02", 800, "Hogar"));
        plataforma.insertarProducto(new Producto("P03", 1500, "Tecnologia"));
        plataforma.insertarProducto(new Producto("P04", 400, "Ropa"));

        System.out.println("Buscar producto:");
        System.out.println(plataforma.buscarProducto("P02"));

        System.out.println("\nProductos ordenados por precio:");
        plataforma.mostrarOrdenadosPorPrecio();

        System.out.println("\nProductos de categoria Tecnologia:");

        for (Producto p : plataforma.filtrarCategoria("Tecnologia")) {
            System.out.println(p);
        }
    }
}