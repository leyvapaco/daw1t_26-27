package ud1.tarea6;

import java.util.Scanner;

public class Ej6_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = teclado.nextDouble();

        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Calcular diámetro");
            System.out.println("2. Calcular perímetro");
            System.out.println("3. Calcular área");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion < 1 || opcion > 3);

        switch (opcion) {
            case 1:
                System.out.println("Diámetro = " + (2 * radio));
                break;

            case 2:
                System.out.println("Perímetro = " + (2 * Math.PI * radio));
                break;

            case 3:
                System.out.println("Área = " + (Math.PI * radio * radio));
                break;
        }

        teclado.close();
    }
}