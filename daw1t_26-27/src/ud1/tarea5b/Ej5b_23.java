package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sabor, respuesta;
        String tipoChocolate="blanco";
        double precio = 0;
        double nata = 0;
        double nombre = 0;

        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        sabor = sc.nextLine().toLowerCase();

        switch (sabor) {
            case "manzana":
                precio = 18;
                break;

            case "fresa":
                precio = 16;
                break;

            case "chocolate":
                System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
                tipoChocolate = sc.nextLine().toLowerCase();

                if (tipoChocolate.equals("negro"))
                    precio = 14;
                else if (tipoChocolate.equals("blanco")) 
                    precio = 15;
                
                break;

            default:
                System.out.println("Sabor no valido.");
                sc.close();
                return;
        }

        
        System.out.print("¿Quiere nata? (si o no): ");
        respuesta = sc.nextLine().toLowerCase();

        if (respuesta.equals("si")) 
            nata = 2.50;
        
        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        respuesta = sc.nextLine().toLowerCase();

        if (respuesta.equals("si")) 
            nombre = 2.75;
        

        System.out.println();

        if (sabor.equals("chocolate")) {
            System.out.printf("Tarta de chocolate %s: %.2f €%n",
                    tipoChocolate, precio);
        } else {
            System.out.printf("Tarta de %s: %.2f €%n", sabor, precio);
        }

        if (nata > 0) {
            System.out.printf("Con nata: %.2f €%n", nata);
        }

        if (nombre > 0) {
            System.out.printf("Con nombre: %.2f €%n", nombre);
        }

        System.out.printf("Total: %.2f €%n", precio + nata + nombre);

        sc.close();
    }
}