package ud1.ejemplos;

public class Narrowing {

    public static void main(String[] args) {

        // 1. double → int (pierde decimales)
        double d1 = 9.78;
        int i1 = (int) d1;
        System.out.println("1. double → int: " + i1);

        // 2. long → int (overflow)
        long l1 = 3000000000L;   // supera el rango de int
        int i2 = (int) l1;
        System.out.println("2. long → int (overflow): " + i2);

        // 3. int → short
        int i3 = 20000;
        short s1 = (short) i3;
        System.out.println("3. int → short: " + s1);

        // 4. int → byte (overflow típico)
        int i4 = 130;
        byte b1 = (byte) i4;
        System.out.println("4. int → byte (overflow): " + b1);

        // 5. char → byte
        char c1 = 'A';   // 65 en ASCII
        byte b2 = (byte) c1;
        System.out.println("5. char → byte: " + b2);

        // 6. float → byte
        float f1 = 123.99f;
        byte b3 = (byte) f1;
        System.out.println("6. float → byte: " + b3);

        // 7. double → short (overflow)
        double d2 = 40000.5;
        short s2 = (short) d2;
        System.out.println("7. double → short (overflow): " + s2);

        // 8. Narrowing en expresiones
        int a = 5;
        int b = 2;

        double r1 = (double) (a / b);  // división como int
        double r2 = (double) a / b;    // casting antes de dividir

        System.out.println("8. Expresión (a/b como int): " + r1);
        System.out.println("9. Expresión (casting antes): " + r2);
    }
}

