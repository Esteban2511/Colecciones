package Escenario4;

public class Main {

    public static void main(String[] args) {

        CatalogoProductos catalogo = new CatalogoProductos();

        catalogo.insertarProducto(new Producto("P01", "Laptop", 2500));
        catalogo.insertarProducto(new Producto("P02", "Mouse", 80));
        catalogo.insertarProducto(new Producto("P03", "Teclado", 150));
        catalogo.insertarProducto(new Producto("P04", "Monitor", 900));

        System.out.println("Buscar producto por codigo:");
        Producto encontrado = catalogo.buscarProducto("P03");

        if(encontrado != null){
            System.out.println(encontrado);
        }else{
            System.out.println("Producto no encontrado");
        }

        System.out.println("\nProductos ordenados por precio:");

        catalogo.mostrarProductosOrdenados();
    }
}