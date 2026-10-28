package ud1.tarea8a;

//Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello
//asteriscos (*).
//Por ejemplo, para n=4:
import java.util.Scanner;

public class Ej8a_14 {
public static void main(String[] args) {
	  
 Scanner sc = new Scanner(System.in);
 System.out.println("Introduce longitud:");
 int n = sc.nextInt();
   
	for (int i = 0; i < n; i++) {
		
		for (int j=1; j<=(n-i); j++) {	
			System.out.print("*");		
		}
		System.out.println();
	}

}
}