package ud3.ejemplos;

public class PracticaWrappersSol {

    public static void main(String[] args) {

        String edadTexto = "25";
        String alturaTexto = "1.78";
        String activoTexto = "true";

        // 1. Convertir de String a tipos primitivos  
        int edad = Integer.parseInt(edadTexto);

        double altura = Double.parseDouble(alturaTexto);

        boolean activo = Boolean.parseBoolean(activoTexto);

        // 2. Crear wrappers usando valueOf(String)
        Integer edadWrapper = Integer.valueOf(edadTexto);

        Double alturaWrapper = Double.valueOf(alturaTexto);

        Boolean activoWrapper = Boolean.valueOf(activoTexto);

        // 3. Convertir de wrappers a String usando toString()
        String edadCadena = edadWrapper.toString();

        String alturaCadena = alturaWrapper.toString();

        // 4. Obtener constantes de las clases wrapper
        int maxInteger = Integer.MAX_VALUE;

        int minInteger = Integer.MIN_VALUE;

        double maxDouble = Double.MAX_VALUE;

        double minDouble = Double.MIN_VALUE;

        // 5. Realizar cálculos
        int edadDentroDeCinco = edad + 5;

        double alturaMasDiezCm = altura + 0.10;

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