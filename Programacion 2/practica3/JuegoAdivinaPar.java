package practica3;
public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    @Override
    public boolean validaNumero(int numero) {
        if (numero < 0 || numero > 10) return false;
        if (numero % 2 != 0) {
            System.out.println("Error: El número debe ser PAR.");
            return false;
        }
        return true;
    }
    @Override
    public void juega() {
        System.out.println("\n--- Juego Adivina Número PAR ---");
        super.juega();
    }
}
