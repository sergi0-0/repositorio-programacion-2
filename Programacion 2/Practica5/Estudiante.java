package Practica5;
public class Estudiante {
    private String codigo;
    private String nombre;
    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo);
    }
}
