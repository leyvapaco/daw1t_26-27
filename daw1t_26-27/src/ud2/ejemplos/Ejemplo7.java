package ud2.ejemplos;

//Excepciones propias

class FiestaVecino extends Exception {
    public FiestaVecino(String texto) {
        super(texto);
    }
}

public class Ejemplo7 {
    public static void main(String[] args) {
        try {
            throw new FiestaVecino("Esta noche no pego ojo");
        } catch (FiestaVecino e) {
            System.out.println(e.getMessage());
        }
    }
}