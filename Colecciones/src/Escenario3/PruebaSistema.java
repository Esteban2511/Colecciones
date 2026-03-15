package Escenario3;

public class PruebaSistema {

    public static void main(String[] args) {

        int[] tamanios = {100, 1000, 10000, 100000};

        for(int n : tamanios){

            SistemaTaxis sistema = new SistemaTaxis();

            long inicioTiempo = System.nanoTime();

            for(int i = 0; i < n; i++){
                Solicitud s = new Solicitud(
                        "SOL" + i,
                        "Usuario" + i,
                        "Origen" + (i % 10),
                        "Destino" + (i % 5)
                );

                sistema.registrarSolicitud(s);
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