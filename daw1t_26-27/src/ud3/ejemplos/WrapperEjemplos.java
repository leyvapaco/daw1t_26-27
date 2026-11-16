package ud3.ejemplos;

public class WrapperEjemplos {

    public static void main(String[] args) {

        // 1. Tipo primitivo
        int numeroPrimitivo = 10;

        // 2. Wrapper
        Integer numeroWrapper = 10;

        // 3. Autoboxing (int -> Integer)
        Integer autoboxing = numeroPrimitivo;

        // 4. Unboxing (Integer -> int)
        int unboxing = numeroWrapper;

        System.out.println("Primitivo: " + numeroPrimitivo);
        System.out.println("Wrapper: " + numeroWrapper);
        System.out.println("Autoboxing: " + autoboxing);
        System.out.println("Unboxing: " + unboxing);
        
        //Convertimos Integer en byte
        byte b = numeroWrapper.byteValue();  
        System.out.println("b: "+b);
        
        //Convertimos Integer en short
        short s = numeroWrapper.shortValue(); 
        System.out.println("s: "+s);
        
        //Convertimos Integer en long
        long l = numeroWrapper.longValue(); 
        System.out.println("l: "+l);
        
        //Convertimos Integer en float
        float f = numeroWrapper.floatValue(); 
        System.out.println("f: "+f);
        
        //Convertimos Integer en double
        double d = numeroWrapper.doubleValue(); 
        System.out.println("d: "+d);

        //Convertimos Integer en String  IMPORTANTE
        String texto = numeroWrapper.toString(); 
        System.out.println("texto: "+texto); // "10"

        // 5. Conversión de String a int (primitivo)  IMPORTANTE
        int valorInt = Integer.parseInt(texto);
        System.out.println(valorInt);
        System.out.println("\nString -> int: " + valorInt);
        
        // 6. Conversión de String a Integer (Wrapper) IMPORTANTE
        Integer valorInteger = Integer.valueOf(texto);
        System.out.println("String -> Integer: " + valorInteger);

        // 7. Métodos útiles de Integer
        System.out.println("\nMáximo Integer: " + Integer.MAX_VALUE);
        System.out.println("Mínimo Integer: " + Integer.MIN_VALUE);

        // 8. Comparación de wrappers
        Integer x = 100;
        Integer y = 100;
        Integer z = 200;
        Integer t = 200;

        //Como norma general debes usar equals() para comparar objetos Integer.
        System.out.println("\nx == y: " + (x == y));
        System.out.println("z == t: " + (z == t)); //Sorprendente, ¿verdad?. 
        System.out.println("z.equals(t): " + z.equals(t)); //equals() no compara las referencias. Compara el valor almacenado
        
        
        // 9. Conversión entre tipos
        Double decimal = 15.75;
        int entero = decimal.intValue();

        System.out.println("\nDouble: " + decimal);
        System.out.println("Double -> int: " + entero);

        // 10. Uso de null (solo wrappers)
        Integer dato = null;

        System.out.println("\nWrapper puede valer null: " + dato);

        // 11. Conversión a String
        String cadena = numeroWrapper.toString();

        System.out.println("Integer -> String: " + cadena);

        // 12. Comparación primitivo y wrapper
        int n1 = 150;
        Integer n2 = 150;

        System.out.println("\nn1 == n2: " + (n1 == n2));

        // 13. Otros wrappers
        Boolean activo = true;
        Character letra = 'A';
        Double precio = 19.99;

        System.out.println("\nBoolean: " + activo);
        System.out.println("Character: " + letra);
        System.out.println("Double: " + precio);
    }
}