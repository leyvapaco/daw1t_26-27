package ud2.ejemplos;

//Capturar excepciones de más específica a más genérica

public class Ejemplo4 {
	public static void main(String[] args) {
		int c;
		int a=1;
		int b=0;
		
		try {
			
			// Genera una ArithmeticException:
			//c=a/b;
			
			// Genera una NullPointerException:
	        String nombre = null;
	        System.out.println(nombre.length());
	        
		}catch (ArithmeticException e) { //Capturamos de más específica a más genérica
			System.out.println("Primera"+e.getMessage());

		}catch (Exception e) { 
			System.out.println("Segunda"+e.getMessage());

		}	
		System.out.println("¿Llega aquí?");
	}

}

