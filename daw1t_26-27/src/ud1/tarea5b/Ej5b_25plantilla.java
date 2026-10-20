package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_25plantilla {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float precioComida = 0.0f;
        float precioBebida = 0.0f;
        boolean continuar=true;  //Si alguna de las opciones introducidas no es válida, no calcularemos el total

        System.out.println("¿Qué has tomado de comer? (palmera, donut, pitufo)");
        String comida = sc.nextLine().toLowerCase();

        switch (comida) {
        	//COMPLETAR
        
        
             default:
                System.out.println("Opción de comida no válida.");
                continuar=false;
        }
        
        if (continuar) {

        	System.out.println("¿Qué has tomado de bebida? (zumo, café)");
        	String bebida = sc.nextLine().toLowerCase();

        	if (bebida.equals("zumo")) {
        		precioBebida = 1.50f;
        	} else if (bebida.equals("café")) {
        		precioBebida = 1.20f;
        	} else {
        		System.out.println("Opción de bebida no válida.");
        		continuar=false;
         
        	}
        }

        if (continuar) {
        float total = precioComida + precioBebida;
        System.out.printf("El precio total del desayuno es: "+ total +" euros");
        }
    }
}
