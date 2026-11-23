package ud3.ejemplos;
import java.util.Scanner;


public class EjercicioRegexSolucion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        // 1. Solo letras
        System.out.println("1. Comprueba que incluye solo letras: "
                + texto.matches("^[a-zA-Z]+$"));

        // 2. Solo números
        System.out.println("2. Solo números: "
                + texto.matches("^\\d+$"));

        // 3. Tres letras mayúsculas, guion y cuatro números
        // Ejemplo: ABC-1234
        System.out.println("3. Código empleado según el formato indicado: "
                + texto.matches("^[A-Z]{3}-\\d{4}$"));

        // 4. Cuatro números, guion y tres letras mayúsculas
        // Ejemplo: 1234-ABC
        System.out.println("4. Matrícula: "
                + texto.matches("^\\d{4}-[A-Z]{3}$"));

        // 5. Usuario entre 5 y 12 caracteres
        // Solo minúsculas y números
        System.out.println("5. Usuario: "
                + texto.matches("^[a-z0-9]{5,12}$"));

        // 6. DNI simplificado
        // Ejemplo: 12345678A
        System.out.println("6. DNI: "
                + texto.matches("^\\d{8}[A-Z]$"));

        // 7. Fecha dd/mm/yyyy
        // Ejemplo: 25/12/2025
        System.out.println("7. Fecha: "
                + texto.matches("^\\d{2}/\\d{2}/\\d{4}$"));

        // 8. Email simple
        // Ejemplo: pepe@gmail.com
        System.out.println("8. Email: "
                + texto.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$"));

        sc.close();
    }
}