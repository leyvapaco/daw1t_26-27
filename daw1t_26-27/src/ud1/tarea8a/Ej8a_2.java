package ud1.tarea8a;

import java.util.Scanner;

public class Ej8a_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ctdAlumnos = 0;
        int edadAlumno;
        int ctdMayoresEdad = 0;
        int sumaEdades = 0;

        System.out.println("Introduce las edades de los alumnos (edad negativa para terminar):");

        do  {
            System.out.print("Edad del alumno : ");
            edadAlumno=scanner.nextInt();
  
            if (edadAlumno>0) {          
            	if (edadAlumno >= 18) 
            		ctdMayoresEdad++;
            	
                sumaEdades += edadAlumno;
                ctdAlumnos++;
            }
        }while (edadAlumno>0);

        if (ctdAlumnos > 0) {
            float mediaEdad = (float) sumaEdades / ctdAlumnos;

            System.out.println("\n--- Estadísticas ---");
            System.out.println("Total de alumnos: " + ctdAlumnos);
            System.out.println("Suma de edades: " + sumaEdades);
            System.out.printf("Media de edad: %.2f\n", mediaEdad);
            System.out.println("Alumnos mayores de edad: " + ctdMayoresEdad);
        } else {
            System.out.println("No se introdujeron edades válidas.");
        }

        scanner.close();
    }
}

