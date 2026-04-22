import java.util.*;

public class SistemaPedidos {
    public static void main(String[] args) {

        Map<String, LinkedList<String>> pedidos = new HashMap<>();

        // cliente Ana
        LinkedList<String> ana = new LinkedList<>();
        ana.add("Camisa");
        ana.add("Pantalón");
        pedidos.put("Ana", ana);

        // cliente Luis
        LinkedList<String> luis = new LinkedList<>();
        luis.add("Zapatos");
        pedidos.put("Luis", luis);

        // cantidad de productos de Ana
        System.out.println("Ana tiene: " + pedidos.get("Ana").size() + " productos");

        // agregar producto a Luis SIN borrar lo anterior
        pedidos.get("Luis").add("Gorra");

        // mostrar pedidos
        for (String cliente : pedidos.keySet()) {
            System.out.println(cliente + ": " + pedidos.get(cliente));
        }
    }
}