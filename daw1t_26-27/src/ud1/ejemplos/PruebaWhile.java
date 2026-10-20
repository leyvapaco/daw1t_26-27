package ud1.ejemplos;

import java.util.Scanner;

public class PruebaWhile {
	public static void main(String[] args) {
		
		int suma=0;
		int numLeido=0;
		final int TOPE=200;
		
		Scanner sc=new Scanner(System.in);
			
		do {		
			System.out.printf("Introduce números y calcularé la suma. Finaliza si introduces 0 o la suma total supera %d",TOPE);
			
			numLeido=sc.nextInt();
			
			suma+=numLeido;
			
			System.out.println("Suma: "+suma);
			
		}while ((numLeido!=0)&&(suma<TOPE));
		
		System.out.println("Fin");
		sc.close();
	}

}
