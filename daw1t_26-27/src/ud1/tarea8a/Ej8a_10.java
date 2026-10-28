package ud1.tarea8a;

import java.util.Scanner;

// Implementar una aplicación que pida un número al usuario entre el 1 y el 10, 
// y calcule su tabla de multiplicar. El código debe asegurarse de que el número introducido está entre 1 y 10, 
// y si no es así, volver a pedirlo hasta que lo cumpla.


public class Ej8a_10 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int tabla;
		int resultado;
		
		do {
			System.out.println("Introduce tabla ");
			tabla=sc.nextInt();
		} while (tabla<0 || tabla>10);
		
		for (int i=1;i<=10;i++) {
			resultado=(i*tabla);
			System.out.println(tabla+"x"+i+"="+resultado);
		}

	}

}
