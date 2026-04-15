public class Manifiesto {

    Contenedor[] lista = new Contenedor[10];

    public void cargar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Contenedor("C" + i, (i + 1) * 10, i % 3);
        }
    }

    public double pesoTotal() {
        double total = 0;
        for (Contenedor c : lista) {
            total += c.peso;
        }
        return total;
    }
}   