package Escenario3;

public class Main {
    public static void main(String[] args) {

        SistemaTaxis sistema = new SistemaTaxis();

        sistema.registrarSolicitud(new Solicitud("S1","Carlos","Centro","Aeropuerto"));
        sistema.registrarSolicitud(new Solicitud("S2","Ana","Hospital","Centro"));
        sistema.registrarSolicitud(new Solicitud("S3","Luis","Universidad","Terminal"));

        sistema.mostrarSolicitudes();

        sistema.atenderSolicitud();

        sistema.cancelarSolicitud("S3");

        sistema.mostrarSolicitudes();
    }
}
