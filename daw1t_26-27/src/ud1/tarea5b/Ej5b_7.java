package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Introduce la primera nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        nota2 = teclado.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        nota3 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La media es: " + media);

        if (media < 5) {
            System.out.println("Insuficiente");
        } else if (media < 6) {
            System.out.println("Suficiente");
        } else if (media < 7) {
            System.out.println("Bien");
        } else if (media < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

        teclado.close();
    }
}


