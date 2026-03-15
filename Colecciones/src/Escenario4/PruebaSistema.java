package Escenario4;

public class PruebaSistema {

    public static void main(String[] args) {

        int[] tamanios = {100, 1000, 10000, 100000};

        for(int n : tamanios){

            CatalogoProductos catalogo = new CatalogoProductos();

            long inicioTiempo = System.nanoTime();

            for(int i = 0; i < n; i++){

                Producto p = new Producto(
                        "P" + i,
                        "Producto" + i,
                        Math.random() * 1000
                );

                catalogo.insertarProducto(p);
            }

            long finTiempo = System.nanoTime();

            long tiempoTotal = finTiempo - inicioTiempo;

            Runtime runtime = Runtime.getRuntime();
            long memoriaUsada = runtime.totalMemory() - runtime.freeMemory();

            System.out.println("Datos: " + n);
            System.out.println("Tiempo ejecución (ns): " + tiempoTotal);
            System.out.println("Memoria usada aprox (bytes): " + memoriaUsada);
            System.out.println("-----------------------------");
        }
    }
}