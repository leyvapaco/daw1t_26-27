package ud1.tarea5b;

import java.util.Scanner;

/*
Escribe un programa que pida por teclado un día de la semana
 y que diga qué asignatura toca a primera hora ese día.
 */

public class Ej5b_1b {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el día de la semana");
		String dia;
		
		dia=sc.next();
		
		//Las cadenas (Strings) se compararan con el método .equals() 
		
		if (dia.equals("Lunes"))
				System.out.println("Programación");
		
		if (dia.equals("Martes"))
			System.out.println("Digitalización");
		
		// etc
				
	}

}
