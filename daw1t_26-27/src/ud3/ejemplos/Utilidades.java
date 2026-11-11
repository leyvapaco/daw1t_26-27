package ud3.ejemplos;

import java.util.Scanner;

//Excepción propia
class DivPorCeroException extends Exception {
public DivPorCeroException(String mensaje) {
	super(mensaje); 
	}
}

//Excepción propia para controlar si el resultado de una resta es negativo
class RestaException extends Exception {
public RestaException(String mensaje) {
	super(mensaje); 
	}
}

//Excepción propia para el caso en que la operación no sea valida

class OpNoValidaException extends Exception {
public OpNoValidaException(String mensaje) {
	super(mensaje); 
	}
}

public class Utilidades {
	
static boolean validaOperacion(Character op) throws OpNoValidaException{
	
	if (Character.isLetterOrDigit(op)) {
		throw new OpNoValidaException("Valida: Op no permitida");
		}
	return true; 
}
				
 static double suma(double a, double b) {
	 return a+b;
 }
 
 static double resta(double a, double b) throws RestaException {
	 if(b>a)
		 throw new RestaException("Resta negativa");
	 return a-b;
 }
 
 static double producto(double a, double b) {
	 return a*b;
 }
	
 static double divide(double a, double b) throws DivPorCeroException {
	 if (b == 0) {
         throw new DivPorCeroException("No se puede dividir entre cero.");
     }
	 	 return a/b;
 }
 
  
 static double calcular(double a, double b, char op) throws DivPorCeroException,RestaException {
	 		 
     	 switch (op) {
         case '+': return suma(a,b);
         case '-': return resta(a,b);
         case '*': return producto(a,b);
         case '/':return divide(a,b);
         default:
             throw new IllegalArgumentException("Operación no implementada.");
     }
 }
 
}

