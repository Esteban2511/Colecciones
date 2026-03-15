package Escenario1;

public class Main {

    public static void main(String[] args) {

        SistemaPacientes sistema = new SistemaPacientes();

        sistema.registrarPaciente(new Paciente("1010", "Carlos"));
        sistema.registrarPaciente(new Paciente("2020", "Ana"));
        sistema.registrarPaciente(new Paciente("3030", "Luis"));

        sistema.registrarPaciente(new Paciente("1010", "Carlos"));

        System.out.println("Buscar paciente por documento:");
        Paciente p = sistema.buscarPaciente("2020");

        if(p != null){
            System.out.println(p);
        }else{
            System.out.println("Paciente no encontrado");
        }

        System.out.println("\nPacientes en orden de llegada:");
        for(Paciente paciente : sistema.getMapaLlegada().values()){
            System.out.println(paciente);
        }
    }
}