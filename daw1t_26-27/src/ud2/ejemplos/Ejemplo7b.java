package ud2.ejemplos;

//Excepciones propias

class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

public class Ejemplo7b {
    public static void main(String[] args) {
        try {
            throw new MiExcepcion("Ha ocurrido un error personalizado");
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}