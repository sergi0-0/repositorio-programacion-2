package practica3;
public class Aplicacion2 {
    public static void main(String[] args) {
        JuegoAdivinaNumero juegoGeneral = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);

        juegoGeneral.juega();
        juegoPar.juega();
        juegoImpar.juega();
    }
}

