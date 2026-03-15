    package Escenario2;

    public class PruebaSistema {

    public static void main(String[] args) {

        int[] tamanios = {100, 1000, 10000, 100000};

        for (int n : tamanios) {

            long inicio = System.nanoTime();

            for (int i = 0; i < n; i++) {
                Producto p = new Producto("P" + i, Math.random() * 1000, "categoria" + (i % 10));
                Tienda.insertarProducto(p);
            }

            long fin = System.nanoTime();

            long tiempo = fin - inicio;

            Runtime runtime = Runtime.getRuntime();
            runtime.gc();
            long memoria = runtime.totalMemory() - runtime.freeMemory();

            System.out.println("Datos: " + n);
            System.out.println("Tiempo (ns): " + tiempo);
            System.out.println("Memoria aproximada (bytes): " + memoria);
            System.out.println("-----------------------------");
        }
    }
}