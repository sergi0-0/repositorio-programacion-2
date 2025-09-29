package practica4;
import java.util.Random;
public class Aplicacion2 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Negro"};
        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2) + 1; // 1 = Cuadro, 2 = Círculo
            String color = colores[rand.nextInt(colores.length)];
            if (tipo == 1) {
                double lado = 1 + rand.nextDouble() * 10;
                figuras[i] = new Cuadro(color, lado);
            } else {
                double radio = 1 + rand.nextDouble() * 10;
                figuras[i] = new Circulo(color, radio);
            }
        }

        // Mostrar info de las figuras
        for (Figura f : figuras) {
            System.out.println(f.toString());
            System.out.println("Área: " + f.area());
            System.out.println("Perímetro: " + f.perimetro());

            // Si implementa Coloreado
            if (f instanceof Coloreado) {
                Coloreado c = (Coloreado) f;
                System.out.println(c.comoColorear());
            }
            System.out.println("----------------------------");
        }
    }
}
