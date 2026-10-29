public class ColaPacientes {

    private static class Nodo {
        String dato;
        Nodo siguiente;

        Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo frente;
    private Nodo fin;

    public ColaPacientes() {
        this.frente = null;
        this.fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(String paciente) {

        Nodo nuevo = new Nodo(paciente);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
            return;
        }

        fin.siguiente = nuevo;
        fin = nuevo;
    }

    public String desencolar() {

        if (estaVacia())
            throw new IllegalStateException("La cola está vacía");

        String valor = frente.dato;
        frente = frente.siguiente;

        if (frente == null)
            fin = null;

        return valor;
    }

    public String verFrente() {

        if (estaVacia())
            throw new IllegalStateException("La cola está vacía");

        return frente.dato;
    }

    public int tamaño() {

        int contador = 0;
        Nodo actual = frente;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
    }

    public void imprimir() {

        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        Nodo actual = frente;

        while (actual != null) {
            System.out.print(actual.dato);

            if (actual.siguiente != null)
                System.out.print(" → ");

            actual = actual.siguiente;
        }

        System.out.println();
    }
}