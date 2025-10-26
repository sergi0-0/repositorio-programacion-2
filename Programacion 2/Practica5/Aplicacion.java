package Practica5;
public class Aplicacion {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca UMSA");
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombia");
        Autor autor2 = new Autor("Mario Vargas Llosa", "Perú");
        biblioteca.agregarAutor(autor1);
        biblioteca.agregarAutor(autor2);
        Libro libro1 = new Libro("Cien Años de Soledad", "978-3-16-148410-0");
        libro1.agregarPagina(1, "En un lugar de la Mancha...");
        libro1.agregarPagina(2, "Segunda página del libro...");
        Libro libro2 = new Libro("La Ciudad y los Perros", "978-84-376-0494-7");
        libro2.agregarPagina(1, "Inicio del libro...");
        libro2.agregarPagina(2, "Continuación...");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        Estudiante estudiante = new Estudiante("2025001", "Juan Pérez");
        biblioteca.prestarLibro(estudiante, libro1);
        biblioteca.mostrarEstado();
        biblioteca.cerrarBiblioteca();
    }
}
