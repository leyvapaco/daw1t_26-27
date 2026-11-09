package ud2.ejemplos;

//Incluir un finally para finalizar de forma ordenada

public class Ejemplo5 {
	public static void main(String[] args) {
		int c;
		int a=1;
		int b=0;
		
		try {
			c=a/b;
		}catch (ArithmeticException e) {
			System.out.println("Primer catch");

		}finally {
			System.out.println("Acciones para finalizar el programa de forma ordenada.");

		}
		
		
		System.out.println("¿Llega aquí?");
		
	}

}

