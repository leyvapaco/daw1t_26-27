package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_1b {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce el día de la semana: ");
			String dia;
			String asignatura="";
			
			dia=sc.next();
					
			switch(dia){
				case "Lunes","viernes":
					asignatura="Programación";
				break;
				case "Martes":
					asignatura="Digitalización";		
				break;
				default:
					asignatura="Ninguna";		
				
			}
			
			System.out.println("La asignatura es: "+asignatura);

		}

	}
