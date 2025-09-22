package practica3;
import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
    public void juega() {
        reiniciaPartida(super.numeroDeVidas);
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Juego Adivina Número ---");
        System.out.println("Tienes " + numeroDeVidas + " vidas.");
        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = sc.nextInt();
            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Debe estar entre 0 y 10.");
                continue;
            }
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (intento < numeroAAdivinar) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
                if (!quitaVida()) {
                    System.out.println("Te quedaste sin vidas. El número era: " + numeroAAdivinar);
                    break;
                } else {
                    System.out.println("Te quedan " + numeroDeVidas + " vidas.");
                }
            }
        }
    }
}
