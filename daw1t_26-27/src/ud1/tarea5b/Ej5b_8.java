package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c;
        double x1, x2, discriminante;

        System.out.print("Introduce el valor de a: ");
        a = teclado.nextInt();

        System.out.print("Introduce el valor de b: ");
        b = teclado.nextInt();

        System.out.print("Introduce el valor de c: ");
        c = teclado.nextInt();

        if (a == 0) {
            System.out.println("No es una ecuacion de segundo grado.");
        } else {
            discriminante = b * b - 4.0 * a * c;

            if (discriminante > 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                System.out.println("Hay dos soluciones reales, x1 y x2:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            } else if (discriminante == 0) {
                x1 = -b / (2.0 * a);

                System.out.println("Hay una solucion doble (x1 es igual a x2):");
                System.out.println("x = " + x1);

            } else {
                System.out.println("No hay soluciones reales.");
            }
        }

        teclado.close();
    }
}
