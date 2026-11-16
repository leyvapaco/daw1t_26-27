package ud2.ejemplos;
import java.util.Scanner;

//Excepción propia para el caso de un idioma no definido
class IdiomaNoSoportadoException extends Exception {
public IdiomaNoSoportadoException(String mensaje) {
	super(mensaje); 
	}
}

//Excepción propia para el caso de una palabra no definida en el diccionario
class PalabraNoExisteException extends Exception {
public PalabraNoExisteException(String mensaje) {
	super(mensaje); 
	}
}

public class Traductor {
	
	public static String traduce (String palabraATraducir, String idioma) throws IdiomaNoSoportadoException, PalabraNoExisteException{
		String palabraTraducida="";
		
		switch(idioma) {
			case "EN":
				switch(palabraATraducir) {
					case "hola":
						palabraTraducida="Hello";
						break;
					case "bueno":
						palabraTraducida="Good";
						break;
					default:
						throw new PalabraNoExisteException("Palabra no encontrada");	
				}
				break;
			
			case "DE":
				switch(palabraATraducir) {
					case "hola":
						palabraTraducida="Hallo";
						break;
					case "bueno":
						palabraTraducida="Gut";
						break;
					default:
						throw new PalabraNoExisteException("Palabra no encontrada");	
				}
				break;
				
			default:
				throw new IdiomaNoSoportadoException("Idioma no soportado");
		}
		return palabraTraducida;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean continuar=true;
		String palabraEsp="";
		String idiomaDestino="";
		
		do {	
			System.out.println("Introduce la palabra a traducir.\nEscribe Fin para finalizar");
			palabraEsp=sc.next().toLowerCase();
			if (palabraEsp.equals("fin"))
				continuar=false;
			else {
				System.out.println("Introduce el idioma destino: EN, DE");
				idiomaDestino=sc.next().toUpperCase();				
				try {
					System.out.println(traduce(palabraEsp, idiomaDestino));
				}catch (IdiomaNoSoportadoException e) {
						System.out.println("Error 1: " + e.getMessage());
					}catch (PalabraNoExisteException e){
						System.out.println("Error 2: " + e.getMessage());
				}
			}//fin else
		}while(continuar);
		
		sc.close();
		System.out.println("Programa finalizado");
		
	}
}
