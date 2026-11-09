package ud2.ejemplos;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

//Clase que modela una cuenta bancaria:

public class Ejemplo9 {

    public static void retirar(double saldo, double cantidad)
            throws SaldoInsuficienteException {

        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                    "No tienes saldo suficiente para realizar el retiro");
        }
        System.out.println("Retirada realizada correctamente");
    }

    public static void main(String[] args) {
        try {
            retirar(100, 150);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}