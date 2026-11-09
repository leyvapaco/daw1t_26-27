package ud2.ejemplos;

class CredencialesIncorrectasException extends Exception {
    public CredencialesIncorrectasException(String mensaje) {
        super(mensaje);
    }
}

public class Login {

    public static void iniciarSesion(String usuario, String password)
            throws CredencialesIncorrectasException {

        if (!usuario.equals("admin") || !password.equals("1234")) {
            throw new CredencialesIncorrectasException(
                    "Usuario o contraseña incorrectos");
        }

        System.out.println("Sesión iniciada");
    }

    public static void main(String[] args) {
        try {
            iniciarSesion("admin", "0000");
        } catch (CredencialesIncorrectasException e) {
            System.out.println(e.getMessage());
        }
    }
}