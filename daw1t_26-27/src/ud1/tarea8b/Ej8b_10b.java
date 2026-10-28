package ud1.tarea8b;

import java.util.Scanner;

//Letra U (alternativa)

public class Ej8b_10b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe la altura de la barra");
    int n = sc.nextInt();
    
    for (int i = 1; i < n; i++) {
    	
      for (int j = 1; j <= n; j++) {
    	// Comprobamos si estamos en la primera o última columna
        if ((j == 1) || (j == n)) {
          System.out.print("*");
        } else {
          System.out.printf(" ");
        }
      }
      System.out.println("");
    }
    
    // Pintamos última fila
    for (int i = 1; i <= n; i++) {
      if ((i == 1) || (i == n)) {
        System.out.printf(" ");
      } else {
        System.out.printf("*");
      }
    }
  }
}
