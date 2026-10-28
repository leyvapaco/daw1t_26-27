package ud1.tarea8b;
// Realiza un programa que pinte una pirámide HUECA por pantalla. 
//La altura se debe pedir por teclado. 
//El carácter con el que se pinta la pirámide también se debe pedir por teclado.

import java.util.Scanner;

//piramide hueca







public class Ej8b_6 {
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce altura:");
    int altura = sc.nextInt();
    
    System.out.println("Introduce carácter de relleno:");
    String c = sc.next();
    
    for (int i = 1; i <= altura; i++) {  
      //Pinto los espacios en blanco antes del carácter O
      for (int j = 1; j <= altura-i; j++) { 
            System.out.print("-");
          }  	
      //Pinto el carácter O, o los espacios en blanco interiores
      for (int k = 1; k <= (i*2)-1; k++) {
    	  // si estamos en los extremos o en la última fila
    	  if ((k==1) || (k==(i*2)-1) || (i==altura))  
    		  System.out.print(c);
    	  else 
    		  System.out.print("+");
      }
      System.out.println();
    }
  }
}
