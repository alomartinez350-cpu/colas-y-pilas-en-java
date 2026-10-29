public class PilaPlatos {

    private static class Nodo {
        String dato;
        Nodo siguiente;

        Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo tope;

    public PilaPlatos() {
        this.tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void push(String plato) {

        Nodo nuevo = new Nodo(plato);

        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public String pop() {

        if (estaVacia())
            throw new IllegalStateException("La pila está vacía");

        String valor = tope.dato;
        tope = tope.siguiente;

        return valor;
    }

    public String peek() {

        if (estaVacia())
            throw new IllegalStateException("La pila está vacía");

        return tope.dato;
    }

    public int tamaño() {

        int contador = 0;
        Nodo actual = tope;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
    }

    public void imprimir() {

        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }

        Nodo actual = tope;

        while (actual != null) {

            System.out.print(actual.dato);

            if (actual.siguiente != null)
                System.out.print(" ↓ ");

            actual = actual.siguiente;
        }

        System.out.println();
    }
}
