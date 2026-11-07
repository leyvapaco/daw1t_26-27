package ud1.examen;

import java.util.Scanner;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        final int ALTURA = 6;
        final int ANCHURA = 6;

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el carácter:");
        System.out.println("1. *");
        System.out.println("2. #");
        int opcion = sc.nextInt();

        char caracter;

        switch (opcion) {
            case 1:
                caracter = '*';
                break;
            case 2:
                caracter = '#';
                break;
            default:
                caracter = '*';
        }

        for (int i = 0; i < ALTURA; i++) {

            for (int j = 0; j < ANCHURA; j++) {

                if (i == 0
                        || i == ALTURA - 1
                        || j == ANCHURA - 1 - i) {

                    System.out.print(caracter);

                } else {

                    System.out.print(" ");

                }
            }

            System.out.println();
        }

        sc.close();
    }
}