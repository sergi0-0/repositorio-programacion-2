package ejercicios;
import java.util.Scanner;
class EcuacionLineal {
    private double a, b, c, d, e, f;
    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a; this.b = b; this.c = c; this.d = d; this.e = e; this.f = f;
    }
    private double det() {
        return a * d - b * c;
    }
    public boolean tieneSolucion() {
        return Math.abs(det()) > 1e-12;
    }
    public double getX() {
        if (!tieneSolucion()) throw new IllegalStateException("La ecuación no tiene solución");
        return (e * d - b * f) / det();
    }

    public double getY() {
        if (!tieneSolucion()) throw new IllegalStateException("La ecuación no tiene solución");
        return (a * f - e * c) / det();
    }
}
public class TestEcuacionLineal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c, d, e, f: ");
        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            double e = sc.nextDouble();
            double f = sc.nextDouble();

            EcuacionLineal eq = new EcuacionLineal(a, b, c, d, e, f);

            if (eq.tieneSolucion()) {
                double x = eq.getX();
                double y = eq.getY();
                System.out.println("x = " + x + ", y = " + y);
            } else {
                System.out.println("La ecuación no tiene solución");
            }
        } catch (Exception ex) {
            System.out.println("Entrada inválida: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
