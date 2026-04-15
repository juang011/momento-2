import java.util.*;

public class Buque {

    Stack<Contenedor> pila = new Stack<>();

    public void cargar(Contenedor c) {

        // regla del bono (peso)
        if (pila.isEmpty() || c.peso <= pila.peek().peso) {
            pila.push(c);
        }
    }

    public void retirarDanado(String id) {
        Stack<Contenedor> aux = new Stack<>();

        while (!pila.isEmpty()) {
            Contenedor c = pila.pop();

            if (!c.id.equals(id)) {
                aux.push(c);
            }
        }

        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }

        System.out.println("Retirado: " + id);
    }
}