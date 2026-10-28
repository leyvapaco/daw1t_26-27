package ud1.tarea8a;

import java.util.Scanner;

/*
 * Desarrollar un programa que solicite los valores mínimo y máximo 
 * de un rango. A continuación, solicitará por teclado un valor que 
 * debe estar dentro del rango. Si no es asi, volverá a solicitar un 
 * número, y así repetidas veces hasta que el valor esté dentro del rango.
 */


public class Ej8a_5c {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce el límite inferior: ");
		int min=sc.nextInt();
	
		System.out.println("Introduce el límite superior: ");
		int max=sc.nextInt();
		
		int num;
		int intentosMax=3;
		int intentos=0;
		
		do {
			System.out.printf("Introduce un número dentro del rango %d - %d \n",min,max);
			//Equivalente:
			//System.out.println("Introduce un número dentro del rango "+min+"-"+max);  
			num=sc.nextInt();
			
			intentos++;
			if (intentos>intentosMax) {
				System.out.println("Superado el máximo de intentos");
				break; //Para salir del bucle
			}
			else
				System.out.printf("Quedan %d intentos. ",intentosMax-intentos);			
		} while (num<min || num>max);
		
		if ((intentosMax-intentos)>0)
		System.out.println("Número válido ");
		
	}

}
