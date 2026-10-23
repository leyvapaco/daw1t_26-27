package ud1.tarea5b;
import java.util.Scanner;

public class Ej5b_17 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Introduce un número entero: ");
	    int num = Math.abs(sc.nextInt()); // Por si es negativo

	    while (num >= 10) {
	            num = num/10;
	    }

	        System.out.println("La primera cifra es: " + num);
	 }
	
}
