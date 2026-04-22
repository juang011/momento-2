import java.util.*;

public class DirectorioProductos {
    public static void main(String[] args) {

        HashMap<Integer, String> productos = new HashMap<>();

        // agregar productos
        productos.put(101, "Laptop");
        productos.put(102, "Mouse");
        productos.put(103, "Teclado");

        // verificar clave
        System.out.println("¿Existe 102? " + productos.containsKey(102));

        // insertar misma clave
        productos.put(101, "Tablet"); // reemplaza Laptop

        // recorrer mapa
        for (Integer clave : productos.keySet()) {
            System.out.println("Código: " + clave + " -> Producto: " + productos.get(clave));
        }
    }
}