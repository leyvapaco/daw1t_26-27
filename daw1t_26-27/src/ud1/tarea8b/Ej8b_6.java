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
    int n = sc.nextInt();
    
    System.out.println("Introduce carácter de relleno:");
    String c = sc.next();
    
    for (int i = 1; i <= n; i++) {  
      //Pinto los espacios en blanco antes del carácter
      for (int j = 1; j <= n-i; j++) { 
            System.out.print("-");
          }  	
      //Pinto el carácter o el espacio en blanco interior
      for (int k = 1; k <= (i*2)-1; k++) {
    	  if ((k==1) || (k==(i*2)-1) || (i==n))  // si estamos en los extremos o en la última fila
    		  System.out.print(c);
    	  else 
    		  System.out.print("+");
      }
      System.out.println();
    }
  }
}
