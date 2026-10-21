package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;

        System.out.println(
                "Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0"
        );

        System.out.print("Por favor, introduzca el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Ahora introduzca el valor de b: ");
        int b = sc.nextInt();

        if (a != 0) {
             x = (double) -b / a;
            System.out.println("x = " + x);
        } else if (b == 0) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        } else {
            System.out.println("La ecuación no tiene solución.");
        }

        sc.close();
    }
}
