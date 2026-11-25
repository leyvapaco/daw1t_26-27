package ud3.ejemplos;


import java.util.Scanner;

class RobotClasificadoException extends Exception {

    public RobotClasificadoException(String mensaje) {
    	super(mensaje);
    }

}

public class TorneoRobots {

    public static String NormalizaIdentificador(String identificador) {
        return identificador.trim().toLowerCase();
    }

    public static Boolean ValidaIdentificador(String identificador) {
        return identificador.matches("^[a-z]{2}[0-9]{2}[a-z]$");
    }

    public static Integer CalculaPuntuacion(String identificador) {

        Integer digito1 = Integer.parseInt(
            identificador.substring(2, 3)
        );

        Integer digito2 = Integer.parseInt(
            identificador.substring(3, 4)
        );

        return digito1 * 2 + digito2 * 3;
    }

    public static String GeneraEtiqueta(StringBuilder identificador) {

        String letrasIniciales = identificador.substring(0, 2);
        String letraFinal = identificador.substring(4, 5);

        Integer puntuacion = CalculaPuntuacion(identificador.toString());

        return letrasIniciales + "-" + puntuacion + letraFinal;
    }

    public static void CompruebaClasificacion(String identificador)
            throws RobotClasificadoException {

        if (CalculaPuntuacion(identificador) >= 12 ||
                identificador.endsWith("z")) {

            throw new RobotClasificadoException("¡Robot clasificado para la fase final del torneo!");
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String identificador;

        do {

            System.out.print("Introduce el identificador del robot,(ejemplo: RX24A) (SALIR para terminar): ");
            identificador = teclado.nextLine();

            identificador = identificador.trim();

            if (!identificador.equalsIgnoreCase("SALIR")) {

                identificador = NormalizaIdentificador(identificador);

                if (ValidaIdentificador(identificador)) {

                	StringBuilder identificadorSB= new StringBuilder(identificador);
                    System.out.println("Etiqueta: "+GeneraEtiqueta(identificadorSB));

                    try {

                        CompruebaClasificacion(identificador);

                        System.out.println("El robot no está clasificado.");

                    } catch (RobotClasificadoException e) {

                        System.out.println(e.getMessage());

                    }

                } else {

                    System.out.println("Identificador incorrecto.");

                }
            }

        } while (!identificador.equalsIgnoreCase("SALIR"));

        System.out.println("Fin del programa.");

        teclado.close();
    }
}
