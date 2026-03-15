package Escenario3;

public class Solicitud {

    private String id;
    private String usuario;
    private String origen;
    private String destino;

    public Solicitud(String id, String usuario, String origen, String destino) {
        this.id = id;
        this.usuario = usuario;
        this.origen = origen;
        this.destino = destino;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Usuario: " + usuario +
                " | Origen: " + origen +
                " | Destino: " + destino;
    }
}