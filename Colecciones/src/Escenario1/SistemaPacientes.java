package Escenario1;

import java.util.*;

public class SistemaPacientes {

    private HashMap<String, Paciente> mapaPacientes = new HashMap<>();
    private LinkedHashMap<String, Paciente> mapaLlegada = new LinkedHashMap<>();

    public void registrarPaciente(Paciente p) {

        if(!mapaPacientes.containsKey(p.getDocumento())){
            mapaPacientes.put(p.getDocumento(), p);
            mapaLlegada.put(p.getDocumento(), p);
        }
    }
    public LinkedHashMap<String, Paciente> getMapaLlegada() {
        return mapaLlegada;
    }

    public Paciente buscarPaciente(String documento){
        return mapaPacientes.get(documento);
    }
}