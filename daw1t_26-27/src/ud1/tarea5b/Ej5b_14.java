package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        char caracter;
        int opcion;

        System.out.print("Introduce un caracter: ");
        caracter = teclado.next().charAt(0);

        System.out.println("Elige la direccion de la piramide:");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        System.out.print("Opcion: ");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= (5 - i); j++) {
                        System.out.print("-");
                    }
                    for (int j = 1; j <= (2 * i) - 1; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;

            case 2: //Observar que sólo es necesario invertir el bucle más externo con respecto al case 1
            	
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= (5 - i); j++) {
                        System.out.print("-");
                    }
                    for (int j = 1; j <= (2 * i) - 1; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;

            case 3:
            	for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= (5 - i); j++) {
                        System.out.print("-");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }

                for (int i = 4; i >= 1; i--) {
                    for (int j = 1; j <= (5 - i); j++) {
                        System.out.print("-");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;

            case 4:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                for (int i = 4; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Opcion no valida.");
        }

        teclado.close();
    }
}
