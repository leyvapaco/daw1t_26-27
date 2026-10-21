package ud1.ejemplos;

public class Bucles {
public static void main(String[] args) {
	
	//Bucle for. Cuando sabemos de antemano el número de iteraciones a realizar.
	int i,j=0;
	
	for (i=0;i<5;i++) {
		for (j=5;j>0;j--)
			System.out.println("i:"+i+" j:"+j);
		
	}
	
	
	//Bucle while. Se evalúa la condición para iterar siempre antes de entrar
	
	int k=1;
	while (k<=10) {
		System.out.println("k:"+k);
		k++;
	}
	
	//Bucle do-while. Se ejecuta al menos una vez y después se evalúa la condición para seguir iterando
	
	k=1;
	do {
		System.out.println("k:"+k);
		k++;
	}while (k<=10);
		
	
}
}
