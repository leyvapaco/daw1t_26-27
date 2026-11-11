package ud3.ejemplos;

import java.util.Scanner;


//Ejercicio2: Crea aquí una excepción propia OperandoNoValidoException
// para el caso en que el operando no sea un número

public class CalculadoraConFunciones {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Introduce el primer número: ");
     double num1 = sc.nextDouble();

     //Ejercicio2: llama aquí a la función validaOperando(num1)
     // Y captura su posible excepción OperandoNoValidoException
     
     System.out.print("Introduce el segundo número: ");
     double num2 = sc.nextDouble();
     
     //Ejercicio2: llama a la función validaOperando(num2)
     // Y captura su posible excepción OperandoNoValidoException

     System.out.print("Elige operación (+, -, *, /): ");
     Character operacion = sc.next().charAt(0); //Cambiado de char a Character para poder hacer el Ejercicio
        
         
     try {
    	 Utilidades.validaOperacion(operacion); //Validamos que no sea ni letra ni número
    	 double resultado = Utilidades.calcular(num1, num2, operacion);
         System.out.println("Resultado: " + resultado);
     } 
     catch (OpNoValidaException e) {
	 System.out.println("Error: " + e.getMessage());
     }
     catch (DivPorCeroException e) {
         System.out.println("Error: " + e.getMessage());
     } 
     catch (RestaException e) {
         System.out.println("Error: " + e.getMessage());
    }catch (Exception e) {
         System.out.println("Fin del programa");
     }

     sc.close();
 }

}

