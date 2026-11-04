package ud1.ejemplos;

import java.util.Scanner;

public class CuentaAtras {

    public static void contar(int n) {
        if (n == 0) { // caso base
            System.out.println("¡Despegue!");
        } else {
            System.out.println(n);
            contar(n - 1); // llamada recursiva
        }
    }

    public static void main(String[] args) {
        int n = 10;

        contar(n);
    }
}
