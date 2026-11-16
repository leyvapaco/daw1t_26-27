package ud3.ejemplos;

public class PracticaWrappers {

    public static void main(String[] args) {

        String edadTexto = "25";
        String alturaTexto = "1.78";
        String activoTexto = "true";

        // 1. Convertir a tipos primitivos
        int edad = ______________________;

        double altura = ______________________;

        boolean activo = ______________________;

        // 2. Crear wrappers usando valueOf()
        Integer edadWrapper = ______________________;

        Double alturaWrapper = ______________________;

        Boolean activoWrapper = ______________________;

        // 3. Convertir a String usando toString()
        String edadCadena = ______________________;

        String alturaCadena = ______________________;

        // 4. Obtener constantes de las clases wrapper
        int maxInteger = ______________________;

        int minInteger = ______________________;

        double maxDouble = ______________________;

        double minDouble = ______________________;

        // 5. Realizar cálculos
        int edadDentroDeCinco = ______________________;

        double alturaMasDiezCm = ______________________;

        // 6. Mostrar resultados
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Activo: " + activo);

        System.out.println("Edad Wrapper: " + edadWrapper);
        System.out.println("Altura Wrapper: " + alturaWrapper);
        System.out.println("Activo Wrapper: " + activoWrapper);

        System.out.println("Edad String: " + edadCadena);
        System.out.println("Altura String: " + alturaCadena);

        System.out.println("MAX Integer: " + maxInteger);
        System.out.println("MIN Integer: " + minInteger);

        System.out.println("MAX Double: " + maxDouble);
        System.out.println("MIN Double: " + minDouble);

        System.out.println("Edad dentro de 5 años: "
                + edadDentroDeCinco);

        System.out.println("Altura + 10 cm: "
                + alturaMasDiezCm);
    }
}