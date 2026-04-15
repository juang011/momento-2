public class Main {
    public static void main(String[] args) {

        Manifiesto m = new Manifiesto();
        Patio p = new Patio();
        Inspeccion i = new Inspeccion();
        Buque b = new Buque();

        // 1. cargar datos
        m.cargar();
        System.out.println("Peso total: " + m.pesoTotal());

        // 2. pasar al patio
        for (Contenedor c : m.lista) {
            p.ubicar(c);
        }

        // 3. enviar a inspección
        for (int x = 0; x < p.matriz.length; x++) {
            for (int y = 0; y < p.matriz[x].length; y++) {
                Contenedor c = p.matriz[x][y];
                if (c != null) {
                    i.agregar(c);
                    b.cargar(c);
                }
            }
        }

        // 4. procesar inspección
        i.procesar();

        // 5. retirar dañado
        b.retirarDanado("C3");
    }
}