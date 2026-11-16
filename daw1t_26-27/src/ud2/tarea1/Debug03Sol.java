package ud2.tarea1;

import java.util.Scanner;

import java.util.Scanner;

public class Debug03Sol {

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

        sc.close();
    }

    //Primo: Un número natural mayor que 1 que tiene exactamente dos divisores positivos: 1 y él mismo.
    public static boolean esPrimo(int num) {

        if (num < 2) {
            return false;
        }

        boolean primo = true;
        int i = 2;

        while (i < num && primo) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }

        return primo;
    }
}