package ud1.tarea5b;

import java.util.Scanner;

public class Ej5b_21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cargo, diasViaje, estadoCivil;
        double sueldoBase = 0, dietas, sueldoBruto, irpf, sueldoNeto;
        int porcentajeIRPF;

        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        cargo = sc.nextInt();

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        diasViaje = sc.nextInt();

        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estadoCivil = sc.nextInt();

        switch (cargo) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
        }

        dietas = diasViaje * 30;
        sueldoBruto = sueldoBase + dietas;

        if (estadoCivil == 1) {
            porcentajeIRPF = 25;
        } else {
            porcentajeIRPF = 20;
        }

        irpf = sueldoBruto * porcentajeIRPF / 100.0;
        sueldoNeto = sueldoBruto - irpf;

        System.out.println("\n----------------------------------");
        System.out.printf(" Sueldo base              %7.2f \n", sueldoBase);
        System.out.printf(" Dietas (%2d viajes)       %7.2f \n", diasViaje, dietas);
        System.out.println("---------------------------------");
        System.out.printf(" Sueldo bruto             %7.2f \n", sueldoBruto);
        System.out.printf(" Retención IRPF (%2d%%)    %7.2f \n", porcentajeIRPF, irpf);
        System.out.println("---------------------------------");
        System.out.printf(" Sueldo neto              %7.2f \n", sueldoNeto);
        System.out.println("----------------------------------");

        sc.close();
    }
}