package ud1.tarea4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ej4_5 {
	public static void main(String[] args) {
		LocalDateTime ahora= LocalDateTime.now();
	    int anio = ahora.getYear();
	    int mes = ahora.getMonthValue();
	    int dia = ahora.getDayOfMonth();
	    int hora = ahora.getHour();
	    int minutos = ahora.getMinute();
	    int segundos = ahora.getSecond();
	    
	    System.out.println(anio+":"+anio);
	    
	    System.out.println(mes+":"+mes);
	    	    
	    System.out.println(dia+":"+dia);
	    
	    System.out.println(hora+":"+minutos);
	    
	}
}
