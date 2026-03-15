package Escenario3;

import java.util.*;

public class SistemaTaxis {

    private Queue<Solicitud> colaSolicitudes = new LinkedList<>();
    private HashMap<String, Solicitud> mapaSolicitudes = new HashMap<>();


    public void registrarSolicitud(Solicitud s) {

        colaSolicitudes.add(s);
        mapaSolicitudes.put(s.getId(), s);

    }


    public void atenderSolicitud() {

        Solicitud s = colaSolicitudes.poll();

        if(s != null){
            mapaSolicitudes.remove(s.getId());
            System.out.println("Solicitud atendida: " + s);
        }else{
            System.out.println("No hay solicitudes pendientes");
        }
    }


    public void cancelarSolicitud(String id){

        Solicitud s = mapaSolicitudes.get(id);

        if(s != null){
            colaSolicitudes.remove(s);
            mapaSolicitudes.remove(id);
            System.out.println("Solicitud cancelada: " + s);
        }else{
            System.out.println("Solicitud no encontrada");
        }
    }


    public void mostrarSolicitudes(){

        System.out.println("\nSolicitudes pendientes:");

        for(Solicitud s : colaSolicitudes){
            System.out.println(s);
        }
    }
}