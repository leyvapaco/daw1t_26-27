package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_13 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un numero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero no es par.");
        }

        if (numero % 5 == 0) {
            System.out.println("El numero es divisible entre 5.");
        } else {
            System.out.println("El numero no es divisible entre 5.");
        }

        teclado.close();
    }

}
