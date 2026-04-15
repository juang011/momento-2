public class Patio {

    Contenedor[][] matriz = new Contenedor[5][5];

    public void ubicar(Contenedor c) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == null) {
                    matriz[i][j] = c;
                    return;
                }
            }
        }
        System.out.println("Puerto saturado");
    }
}