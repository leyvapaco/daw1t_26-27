package ud2.ejemplos;
class StockInsuficienteException extends Exception {
    public StockInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

public class Tienda {

	//Lógica asociada a la acción de compra su posible error
    public static void comprar(int stock, int cantidad)
            throws StockInsuficienteException {

        if (cantidad > stock) {
            throw new StockInsuficienteException(
                    "No hay suficiente stock");
        }

        stock -= cantidad;
        System.out.println("Compra realizada");
    }

    public static void main(String[] args) {
        try {
            comprar(3, 5);
        } catch (StockInsuficienteException e) {
            System.out.println(e.getMessage());
            // Acciones adicionales
            System.out.println("Avise al cliente");
            System.out.println("Registrar incidencia");
            System.out.println("Proponer lista de espera");
        }
    }
}