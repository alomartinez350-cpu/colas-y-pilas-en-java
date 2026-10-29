public class MainPlatos {

    public static void main(String[] args) {

        PilaPlatos pila = new PilaPlatos();

        System.out.println("¿Está vacía? "
                + pila.estaVacia());

        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");

        System.out.print("Pila tras push Plato 1, Plato 2, Plato 3: ");
        pila.imprimir();

        System.out.println("peek(): "
                + pila.peek());

        System.out.println("pop(): "
                + pila.pop());

        System.out.print("Pila tras pop: ");
        pila.imprimir();

        System.out.println("Tamaño: "
                + pila.tamaño());

        System.out.println("pop(): "
                + pila.pop());

        System.out.println("pop(): "
                + pila.pop());

        System.out.println("¿Está vacía? "
                + pila.estaVacia());
    }
}