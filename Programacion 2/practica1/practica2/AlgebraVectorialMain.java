package hola;
public class AlgebraVectorialMain {

    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(2, 3, 4);
        AlgebraVectorial b = new AlgebraVectorial(1, -2, 2);
        System.out.println("Vector a = " + a);
        System.out.println("Vector b = " + b);
        System.out.println("\nMagnitud de a: " + a.magnitud());
        System.out.println("Magnitud de b: " + b.magnitud());
        System.out.println("\nProducto punto (a · b): " + a.productoPunto(b));
        System.out.println("Producto cruz (a × b): " + a.productoCruz(b));
        System.out.println("\n¿Son perpendiculares? " + a.esPerpendicular(b));
        System.out.println("¿Son paralelos? " + a.esParalelo(b));
        System.out.println("\nProyección de a sobre b: " + a.proyeccionSobre(b));
        System.out.println("Componente de a en dirección de b: " + a.componenteEn(b));
        System.out.println("\nSuma (a + b): " + a.suma(b));
        System.out.println("Resta (a - b): " + a.resta(b));
    }
}

    
    

