/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola;

/**
 *
 * @author natal
 */
public class Vector3DMain {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(2, 3, 4);
        Vector3D b = new Vector3D(1, -2, 2);

        System.out.println("Vector a = " + a);
        System.out.println("Vector b = " + b);

        // Suma
        System.out.println("\nSuma (a + b): " + a.suma(b));

        // Escalar
        System.out.println("a * 3 = " + a.escalar(3));

        // Magnitudes
        System.out.println("\n|a| = " + a.magnitud());
        System.out.println("|b| = " + b.magnitud());

        // Normalización
        System.out.println("\nVector normalizado de a: " + a.normalizar());

        // Producto punto
        System.out.println("\na · b = " + a.productoPunto(b));

        // Producto cruz
        System.out.println("a × b = " + a.productoCruz(b));
    }
}
