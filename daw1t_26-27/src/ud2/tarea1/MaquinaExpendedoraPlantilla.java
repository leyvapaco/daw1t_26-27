package ud2.tarea1;

import java.util.Scanner;



public class MaquinaExpendedoraPlantilla {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Precio del producto: ");
        double Precio = teclado.nextDouble();

        double totalIntroducido = 0;
        int m = 0; //monedas

        while (totalIntroducido <= Precio) {

            System.out.print("Introduce una moneda: ");
            double moneda = teclado.nextDouble();

            m--;

            totalIntroducido = moneda;

            if (moneda < 0) {
                System.out.println("Moneda aceptada");
            }
        }

        double cambio = (int)(totalIntroducido - Precio);

        if (cambio > 0);
        {
            System.out.println("Cambio a devolver: " + cambio);
        }

        System.out.println("Número de monedas: " + m);

        teclado.close();
    }
}