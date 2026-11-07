package ud1.examen;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        final int TEMP_ACTUAL = 22;
        final int MAX_INTENTOS = 6;

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Deseas recibir ayuda? (true/false): ");
        boolean ayuda = sc.nextBoolean();

        int intentos = 0;
        int sumaTemperaturas = 0;
        boolean acertado = false;

        while (intentos < MAX_INTENTOS && !acertado) {

            System.out.print("Introduce una temperatura: ");
            int temperatura = sc.nextInt();

            sumaTemperaturas += temperatura;
            intentos++;

            if (temperatura == TEMP_ACTUAL) {

                acertado = true;
                System.out.println("¡Temperatura correcta!");

            } else {

                System.out.println("Temperatura incorrecta.");

                if (ayuda) {

                    if (temperatura < TEMP_ACTUAL) {
                        System.out.println("Pista: la temperatura correcta es mayor.");
                    } else {
                        System.out.println("Pista: la temperatura correcta es menor.");
                    }

                }

                System.out.println("Intentos restantes: "
                        + (MAX_INTENTOS - intentos));
            }
        }
        //Hacemos un casting a double para tener los decimales
        double media = (double) sumaTemperaturas / intentos;

        if (acertado) {
            System.out.println("Has alcanzado la temperatura correcta.");
        } else {
            System.out.println("No has alcanzado la temperatura correcta.");
        }

        System.out.println("Intentos utilizados: " + intentos);
        System.out.println("Temperatura media introducida: " + media);

        sc.close();
    }
}