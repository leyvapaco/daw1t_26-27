package ud3.tarea2;

public class Ej9 {

    public static void main(String[] args) {

    	// a) Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
        StringBuilder sb = new StringBuilder("Alabí Alixar");
        System.out.println("El StringBuilder es : " + sb);

        //b) Mostrar por consola su capacidad y longitud.
        System.out.println("Capacidad inicial = " + sb.capacity());
        System.out.println("Longitud inicial = " + sb.length());

        //c) Partiendo de la cadena anterior y usando los métodos de 
        //   StringBuilder modificar la cadena para que pase a ser "Chicharrones de Chiclana" 
        //   y mostrarla por consola.
        sb.replace(0, sb.length(), "Chicharrones de Chiclana");
        System.out.println(sb);

        // d) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar 
        // la cadena para que pase a ser "Hay 5000 Chicharrones" y mostrarla por consola. 
        // El número entero 5000 debe estar almacenado en un int inicialmente.
        int num = 5000;

        sb.replace(0, sb.length(), "Hay ");
        sb.append(num);
        sb.append(" Chicharrones");
        System.out.println(sb);

        // e) Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar
        // la cadena para que pase a ser "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
        sb.append(" en Chiclana");
        System.out.println(sb);

        // f) Almacenar en un String los últimos 4 carácteres del StringBuilder
        // resultante y mostrar ese String por consola.
        String ultimos4 = sb.substring(sb.length() - 4);
        System.out.println(ultimos4);

        // g) Mostrar por  consola  la capacidad y longitud del StringBuilder final.
        System.out.println("Capacidad final = " + sb.capacity());
        System.out.println("Longitud final = " + sb.length());

    }
}