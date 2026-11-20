package ud3.ejemplos;

import java.util.Scanner;

public class Ahorcado2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String SECRETA = "Azofaifa";
        final int MAX_INTENTOS = 10;

        boolean acertado = false;
        int intentos = 0;
        char letra;
        int cuantasSinAcertar;

        // Cadena de puntos con la misma longitud que la palabra secreta
        String palabra = ".".repeat(SECRETA.length());

        do {

            System.out.print("\nDime letra: ");
            letra = Character.toLowerCase(sc.next().charAt(0));

            cuantasSinAcertar = 0;

            for (int i = 0; i < SECRETA.length(); i++) {

                if (Character.toLowerCase(SECRETA.charAt(i)) == letra) {

                    palabra = palabra.substring(0, i)
                            + letra
                            + palabra.substring(i + 1);
                }

                if (palabra.charAt(i) == '.') {
                    cuantasSinAcertar++;
                }
            }

            if (cuantasSinAcertar == 0) {
                acertado = true;
            } else {
                intentos++;
                System.out.println("Te quedan "
                        + (MAX_INTENTOS - intentos)
                        + " intentos");
            }

            System.out.println(palabra);

        } while (intentos < MAX_INTENTOS && !acertado);

        if (acertado) {
            System.out.println("¡Acertaste!");
        }

        sc.close();
    }
}