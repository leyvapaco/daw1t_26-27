package ud3.ejemplos;

// VERIFICA LOS RESULTADOS, EN LUGAR DE CON UN SYSO, DEPURANDO PASO A PASO
// Y CONSULTANDO EL VALOR DE LAS VARIABLES EN LA VENTANA DEBUG->VARIABLES

public class PracticaWrappers2Sol {

    public static void main(String[] args) {

        String temperaturaTexto = "-5";
        String alturaTexto = "1.92";
        String activoTexto = "true";

        // 1. Convertir los Strings de arriba a TIPOS PRIMITIVOS
        int temperatura = Integer.parseInt(temperaturaTexto);

        double altura = Double.parseDouble(alturaTexto);

        boolean activo = Boolean.parseBoolean(activoTexto);

        // 2. Convertir los Strings de arriba a WRAPPERS (Clases envolventes)
        Integer temperaturaWrapper = Integer.valueOf(temperaturaTexto);

        Double alturaWrapper = Double.valueOf(alturaTexto);

        Boolean activoWrapper = Boolean.valueOf(activoTexto);

        // 3. Convertir a String usando toString()
        String temperaturaCadena = temperaturaWrapper.toString();

        String alturaCadena = alturaWrapper.toString();

        // 4. Obtener constantes de las clases wrapper
        int maxInteger = Integer.MAX_VALUE;
        int minInteger = Integer.MIN_VALUE;

        long maxLong =  Long.MAX_VALUE;
        long minLong =  Long.MIN_VALUE;

        double maxByte = Byte.MAX_VALUE;
        double minByte = Byte.MIN_VALUE;

        // 5. Character

        Character letra = 'q';
        Character digito = '2';

        boolean comprueba;
        int valorDigito;

        // Comprueba si la variable letra es un dígito
        comprueba = Character.isDigit(letra);

        // Comprueba si la variable digito es un dígito
        comprueba = Character.isDigit(digito);

        // Comprueba si la variable letra está en mayúsculas
        comprueba = Character.isUpperCase(letra);

        // Comprueba si la variable digito es una letra o un dígito
        comprueba = Character.isLetterOrDigit(digito);

        // Obtén el valor numérico del Character digit
        valorDigito = Character.getNumericValue(digito);

        // Comparaciones

        Integer x = 10;
        Integer y = 10;
        Integer z = 150;

        // Comprueba si x es igual a y
        comprueba = x.equals(y);

        // Comprueba si x es igual a z
        comprueba = x.equals(z);

        // Comprueba si x es mayor que z
        comprueba = x.compareTo(z) > 0;

        // Comprueba si x es menor que z
        comprueba = x.compareTo(z) < 0;

        // Compara si x es igual a y
        comprueba = x.compareTo(y) == 0;
    }
}