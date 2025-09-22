package practica3;
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
@Override
    public boolean validaNumero(int numero) {
        if (numero < 0 || numero > 10) return false;
        if (numero % 2 == 0) {
            System.out.println("Error: El número debe ser IMPAR.");
            return false;
        }
        return true;
    }
@Override
    public void juega() {
        System.out.println("\n--- Juego Adivina Número IMPAR ---");
        super.juega();
    }
}
