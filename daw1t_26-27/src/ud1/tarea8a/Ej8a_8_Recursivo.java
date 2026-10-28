package ud1.tarea8a;

import java.util.Scanner;

public class Ej8a_8_Recursivo {

    public static long factorial(int n) {
    	//Identificamos el caso base:
        if (n == 0 || n == 1) {
            return 1;
        }
        // Hacemos una llamada a la propia función, con n-1.
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        System.out.println("Factorial de " + n + " = " + factorial(n));
    }
}
