package Practica5;
import java.util.*;
public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Estudiante estudiante; 
    private Libro libro;           
    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 7);
        this.fechaDevolucion = cal.getTime();
    }
    public void mostrarInfo() {
        System.out.println("Libro: " + libro.getTitulo());
        estudiante.mostrarInfo();
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Fecha de devolución: " + fechaDevolucion + "\n");
    }
}