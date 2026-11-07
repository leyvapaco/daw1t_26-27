package ud1.examen;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        // Constantes
        final int EDAD_MINIMA = 18;
        final int PRECIO_ENTRADA = 15;

        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar búfer

        System.out.print("¿Tienes invitación? (sí/no): ");
        String invitacion = sc.nextLine();

        // Variable booleana
        boolean esMayorEdad = (edad >= EDAD_MINIMA)?true:false;

        // Comprobación de acceso
        if (esMayorEdad) {

            System.out.println("Acceso permitido.");

            if (invitacion.equalsIgnoreCase("sí")
                    || invitacion.equalsIgnoreCase("si")) {
                System.out.println("Entrada gratuita.");
            } else {
                System.out.println("Debes pagar " + PRECIO_ENTRADA + " €.");
            }

        } else {
            System.out.println("Acceso denegado.");
            System.out.println("No puedes acceder al evento.");
        }

        sc.close();
    }
}