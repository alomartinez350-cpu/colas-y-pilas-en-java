public class MainPacientes {

    public static void main(String[] args) {

        ColaPacientes cola = new ColaPacientes();

        System.out.println("¿Está vacía? "
                + cola.estaVacia());

        cola.encolar("Ana");
        cola.encolar("Luis");
        cola.encolar("Carlos");

        System.out.print("Cola de pacientes: ");
        cola.imprimir();

        System.out.println("Paciente al frente: "
                + cola.verFrente());

        System.out.println("Paciente atendido: "
                + cola.desencolar());

        System.out.print("Cola después de atender: ");
        cola.imprimir();

        System.out.println("Tamaño: "
                + cola.tamaño());

        System.out.println("Paciente atendido: "
                + cola.desencolar());

        System.out.println("Paciente atendido: "
                + cola.desencolar());

        System.out.println("¿Está vacía? "
                + cola.estaVacia());
    }
}

