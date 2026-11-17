package ud3.ejemplos;


public class CadenasEjemplos2 {

    public static void main(String[] args) {

        String cad1 = "Chicharrones de Chiclana";
        String cad2 = "chicharrones DE CHICLANA";
        String cad3 = "   Chicharrones de Chiclana - Receta secreta   ";

        int valor;

        System.out.println("=== MÉTODOS BÁSICOS ===");

        System.out.println(cad1 + " | " + cad2);

        System.out.println("length(): " + cad1.length());

        System.out.println("indexOf('C'): " + cad1.indexOf('C'));

        System.out.println("lastIndexOf('a'): " + cad1.lastIndexOf('a'));

        System.out.println("charAt(0): " + cad1.charAt(0));

        System.out.println("substring(16): " + cad1.substring(16));

        System.out.println("toUpperCase(): " + cad1.toUpperCase());

        System.out.println("toLowerCase(): " + cad1.toLowerCase());

        System.out.println("equals(): " + cad1.equals(cad2));

        System.out.println("equalsIgnoreCase(): "
                + cad1.equalsIgnoreCase(cad2));

        System.out.println("compareToIgnoreCase(): "
                + cad1.compareToIgnoreCase(cad2));

        System.out.println("valueOf(5000): "
                + String.valueOf(5000));

        System.out.println("\n=== MÉTODOS PARA LA PRÁCTICA ===");

        System.out.println("Cadena original: [" + cad3 + "]");

        System.out.println("trim(): [" + cad3.trim() + "]");

        System.out.println("startsWith(\"Chicharrones\"): "
                + cad3.trim().startsWith("Chicharrones"));

        System.out.println("endsWith(\"secreta\"): "
                + cad3.trim().endsWith("secreta"));

        System.out.println("contains(\"Chiclana\"): "
                + cad3.contains("Chiclana"));

        valor = cad3.indexOf('-');

        System.out.println("Posición de '-': " + valor);

        System.out.println("substring(0, valor): "
                + cad3.substring(0, valor).trim());

        System.out.println("substring(valor + 1): "
                + cad3.substring(valor + 1).trim());

        System.out.println("replace(\"Chiclana\", \"Cádiz\"): "
                + cad3.replace("Chiclana", "Cádiz"));

        System.out.println("replace(\"Chicharrones\", \"Tortillones\"): "
                + cad3.replace("Chicharrones", "Tortillones"));
    }
}