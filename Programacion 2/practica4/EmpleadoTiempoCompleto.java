package practica4;
public class EmpleadoTiempoCompleto extends Empleado {
    private double salario_anual;
    public EmpleadoTiempoCompleto(String nombre, double salario_anual) {
        super(nombre);
        this.salario_anual = salario_anual;
    }
    @Override
    public double CalcularSalarioMensual() {
        return salario_anual / 12.0;
    }
    @Override
    public String toString() {
        return "EmpleadoTiempoCompleto [Nombre=" + nombre +
               ", Salario Anual=" + salario_anual +
               ", Salario Mensual=" + CalcularSalarioMensual() + "]";
    }
}
