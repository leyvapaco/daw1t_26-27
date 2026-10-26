package ud1.tarea8b;

import java.util.Scanner;

public class Ej8b_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int combinacion = 1234;
        int intento = 0;
        int contador = 0;

        while (intento != combinacion && contador < 4) {

            System.out.print("Introduce la combinación (4 dígitos): ");
            intento = sc.nextInt();

            if (intento == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
            }

            contador++;
        }

        if (intento != combinacion) {
            System.out.println("Has agotado las cuatro oportunidades.");
        }

        sc.close();
    }
}