package ud2.ejemplos;

class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class Ejemplo8 {
    public static void main(String[] args) {
        int nota = 15;

        try {
            if ((nota<0)||(nota > 10)) {
                throw new NotaInvalidaException("La nota debe estar entre 1 y 10");
            }

            System.out.println("Nota válida");
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}