import java.util.*;

public class HistorialNavegacion {
    public static void main(String[] args) {

        LinkedList<String> historial = new LinkedList<>();

        // agregar páginas
        historial.add("google.com");
        historial.add("github.com");
        historial.add("stackoverflow.com.");

        // pagina actual
          System.out.println("Página actual: " + historial.getLast());

        // función atrás
        historial.removeLast();
        System.out.println("Después de atrás: " + historial.getLast());

        // mostrar historial
        System.out.println("Historial:");
        for (String url : historial) {
            System.out.println(url);
        }
    }
}