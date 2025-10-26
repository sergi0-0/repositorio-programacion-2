package Practica5;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario; 
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario("Lunes a Viernes", "08:00", "18:00");
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }
    public void prestarLibro(Estudiante estudiante, Libro libro) {
        Prestamo p = new Prestamo(estudiante, libro);
        prestamos.add(p);
    }
    public void mostrarEstado() {
        System.out.println("\n=== Estado de la Biblioteca: " + nombre + " ===");
        horario.mostrarHorario();

        System.out.println("\nAutores registrados:");
        for (Autor a : autores) a.mostrarInfo();

        System.out.println("\nLibros disponibles:");
        for (Libro l : libros) System.out.println("- " + l.getTitulo());

        System.out.println("\nPréstamos activos:");
        for (Prestamo p : prestamos) p.mostrarInfo();
    }
    public void cerrarBiblioteca() {
        System.out.println("\nCerrando biblioteca...");
        prestamos.clear();
        horario = null; 
        System.out.println("Biblioteca cerrada. Los préstamos y horario ya no existen.");
    }
}
