package ud2.tarea1;

import java.util.Scanner;

/*
Resumen de errores detectados:

	Precio → nombre poco adecuado (convención de nombres).
	m → nombre poco descriptivo.
	m--; → el contador disminuye en lugar de aumentar.
	totalIntroducido = moneda; → se pierde el acumulado.
	if (moneda < 0) → acepta monedas negativas.
	Mensaje "Moneda aceptada" asociado a la condición incorrecta.
	Conversión a int en el cálculo del cambio → pérdida de decimales.
	Punto y coma tras if (cambio > 0); → el bloque se ejecuta siempre.
	Falta validación de importes no positivos.
	Convención de nombres mejorable (Precio, m).
*/

public class MaquinaExpendedoraSolucion {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Precio del producto: ");

        // CORRECCIÓN 1:
        // Se cambia el nombre de la variable para seguir la convención camelCase.
        double precio = teclado.nextDouble();

        double totalIntroducido = 0;

        // CORRECCIÓN 2:
        // Se sustituye "m" por un nombre más descriptivo.
        int ctdMonedas = 0;

        // CORRECCIÓN 3:
        // Debemos seguir pidiendo dinero mientras no se alcance el precio.
        while (totalIntroducido < precio) {

            System.out.print("Introduce una moneda: ");
            double moneda = teclado.nextDouble();

            // CORRECCIÓN 4:
            // Solo se aceptan cantidades positivas.
            if (moneda > 0) {

                // CORRECCIÓN 5:
                // El contador debe incrementarse, no decrementarse.
                ctdMonedas++;

                // CORRECCIÓN 6:
                // Se acumula el dinero introducido en lugar de sobrescribirlo.
                totalIntroducido += moneda;

                System.out.println("Moneda aceptada");
            } else {

                // CORRECCIÓN 7:
                // Las cantidades negativas o cero no son válidas.
                System.out.println("Moneda no válida");
            }
        }

        // CORRECCIÓN 8:
        // No debemos convertir el resultado a int porque perderíamos los céntimos.
        double cambio = totalIntroducido - precio;

        // CORRECCIÓN 9:
        // Se elimina el punto y coma después del if.
        if (cambio > 0) {
            System.out.println("Cambio a devolver: " + cambio);
        }

        // CORRECCIÓN 10:
        // Se muestra la variable con un nombre descriptivo.
        System.out.println("Número de monedas: " + ctdMonedas);

        teclado.close();
    }
}