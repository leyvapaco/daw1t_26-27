package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_12Ternarias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = scanner.nextInt();

        int menor = (a <= b && a <= c) ? a :
                    (b <= a && b <= c) ? b : c;

        int mayor = (a >= b && a >= c) ? a :
                    (b >= a && b >= c) ? b : c;

        int medio = (a + b + c) - menor - mayor;

        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(menor + " " + medio + " " + mayor);

        scanner.close();
    }
}
