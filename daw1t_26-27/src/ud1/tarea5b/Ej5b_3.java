package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la hora (0-23): ");
        int hora = teclado.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Hora no válida");
        }

        teclado.close();
    }
}