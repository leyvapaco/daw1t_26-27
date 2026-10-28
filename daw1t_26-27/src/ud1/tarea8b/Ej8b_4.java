package ud1.tarea8b;

import java.util.Scanner;

public class Ej8b_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Cuántos números de la serie de fibonacci quieres: ?");
    int n = sc.nextInt();
    int fibo = 0;
    int anterior1 = 1;
    int anterior2 = 0;
    int i;
       
    for (i = 0; i <= n; i++) {
      System.out.print(fibo + " ");
      fibo = anterior1 + anterior2;
      anterior2 = anterior1;
      anterior1 = fibo;
    }
  }
}
