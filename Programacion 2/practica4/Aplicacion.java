package practica4;
import java.util.Scanner;
public class Aplicacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nombre del empleado tiempo completo " + (i+1) + ":");
            String nombre = sc.nextLine();
            System.out.println("Ingrese salario anual:");
            double salario = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoCompleto(nombre, salario);
        }
        for (int i = 3; i < 5; i++) {
            System.out.println("Ingrese nombre del empleado por horas " + (i-2) + ":");
            String nombre = sc.nextLine();
            System.out.println("Ingrese horas trabajadas:");
            double horas = sc.nextDouble();
            System.out.println("Ingrese tarifa por hora:");
            double tarifa = sc.nextDouble();
            sc.nextLine(); // limpiar buffer
            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }
        System.out.println("\n--- Nómina de empleados ---");
        for (Empleado e : empleados) {
            System.out.println(e.getClass().getSimpleName() +
                               " -> Nombre: " + e.nombre +
                               ", Salario Mensual: " + e.CalcularSalarioMensual());
        }
        sc.close();
    }
}
