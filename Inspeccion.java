import java.util.*;

public class Inspeccion {

    Queue<Contenedor> cola = new LinkedList<>();

    public void agregar(Contenedor c) {
        if (c.prioridad == 2) {
            cola.add(c);
        }
    }

    public void procesar() {
        while (!cola.isEmpty()) {
            System.out.println("Revisando: " + cola.poll().id);
        }
    }
}