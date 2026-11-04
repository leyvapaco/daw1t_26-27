package ud1.ejemplos;

import java.util.Scanner;

public class SumaRecursiva {

    public static int suma(int n) {
        if (n == 1) { // caso base
            return 1;
        }
        return n + suma(n - 1); // llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        System.out.println("La suma es: " + suma(n));
    }
}
