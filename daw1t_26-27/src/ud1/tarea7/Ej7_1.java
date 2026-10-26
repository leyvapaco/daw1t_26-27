package ud1.tarea7;

public class Ej7_1 {
public static void main(String[] args) {
	int a=1;
	int b=2;
	int c;
	
	System.out.printf("Antes: a:%d b:%d",a,b);
	
	c=a;
	a=b;
	b=c;
	
	System.out.printf("\nDespués: a:%d b:%d",a,b);
	
}
}
