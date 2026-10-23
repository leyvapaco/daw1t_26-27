package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int ultimaCifra;

        System.out.print("Introduce un numero entero: ");
        numero = teclado.nextInt();

        //  El operador % es el resto de la división
        
        ultimaCifra = numero % 10;

        // Si la última cifra es negativa, la ponemos en positivo.
        if (ultimaCifra < 0) {
            ultimaCifra = -ultimaCifra;
        }

        System.out.println("La ultima cifra es: " + ultimaCifra);

        teclado.close();
    }
}



