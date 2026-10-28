package ud1.tarea8a;

import java.util.Scanner;

public class Ej8a_8_No_recursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        long factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("Factorial de " + n + " = " + factorial);
    }
}
