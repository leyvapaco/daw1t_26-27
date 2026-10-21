package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas, minutos, segundos;

        System.out.print("Introduce las horas: ");
        horas = teclado.nextInt();

        System.out.print("Introduce los minutos: ");
        minutos = teclado.nextInt();

        segundos = (23 - horas) * 3600 
                 + (59 - minutos) * 60
                 + 60;

        System.out.println("Faltan " + segundos
                + " segundos para la medianoche.");

        teclado.close();
    }
}
