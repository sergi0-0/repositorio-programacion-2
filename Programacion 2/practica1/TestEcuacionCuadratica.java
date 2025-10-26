package ejercicios;
import java.util.Scanner;

class EcuacionCuadratica {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }
    public double getRaiz1() {
        double d = getDiscriminante();
        if (d < 0) return 0;
        return (-b + Math.sqrt(d)) / (2 * a);
    }
    public double getRaiz2() {
        double d = getDiscriminante();
        if (d < 0) return 0;
        return (-b - Math.sqrt(d)) / (2 * a);
    }
}
public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);
        double disc = eq.getDiscriminante();
        if (disc > 0) {
            System.out.printf("La ecuación tiene dos raíces %.6f y %.6f%n", eq.getRaiz1(), eq.getRaiz2());
        } else if (disc == 0) {
            System.out.printf("La ecuación tiene una raíz %.6f%n", eq.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }
        sc.close();
    }
}
