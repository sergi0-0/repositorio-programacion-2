package ejercicios;
import java.util.Scanner;
class Estadistica {
    private double[] datos;
    public Estadistica(double[] datos) {
        this.datos = datos;
    }
    public double promedio() {
        double suma = 0;
        for (double x : datos) suma += x;
        return suma / datos.length;
    }
    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (double x : datos) suma += Math.pow(x - prom, 2);
        return Math.sqrt(suma / (datos.length - 1));
    }
}
public class TestEstadistica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];
        System.out.println("Ingrese 10 números separados por espacio:");
        for (int i = 0; i < 10; i++) {
            datos[i] = sc.nextDouble();
        }
        Estadistica est = new Estadistica(datos);

        System.out.printf("El promedio es %.2f%n", est.promedio());
        System.out.printf("La desviación estándar es %.6f%n", est.desviacion());
        sc.close();
    }
}
