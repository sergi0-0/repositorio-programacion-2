package practica4;
public abstract class Empleado {
    protected String nombre;
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public abstract double CalcularSalarioMensual();
    @Override
    public String toString() {
        return "Empleado: " + nombre;
    }
}
