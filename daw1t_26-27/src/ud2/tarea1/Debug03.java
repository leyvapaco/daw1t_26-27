package ud2.tarea1;

import java.util.Scanner;

public class Debug03 {

    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número");
        num = sc.nextInt();

        if (esPrimo(num)) {
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }

    }

    //Primo: Un número natural mayor que 1 que tiene exactamente dos divisores positivos: 1 y él mismo.

    public static boolean esPrimo(int num) {

        boolean esPrimo = true;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) { 
                esPrimo = false; //Hay un divisor que no es 1 ni él mismo
            } else {
                esPrimo = true;
            }

        }

        return esPrimo;
    }
}