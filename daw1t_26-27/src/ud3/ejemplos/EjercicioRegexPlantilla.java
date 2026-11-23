package ud3.ejemplos;
import java.util.Scanner;



public class EjercicioRegexPlantilla {

	
	public static void chuleta() {

	    System.out.println("""
	==========================================
	CHULETA DE EXPRESIONES REGULARES (DAW)
	==========================================

	CARACTERES ESPECIALES

	\\d      -> Dígito (0-9)                   Ej: ^\\d$                -> 5
	\\D      -> No dígito                      Ej: ^\\D$                -> A
	\\w      -> Letra, número o _              Ej: ^\\w$                -> A, 5, _
	\\W      -> No letra, número o _           Ej: ^\\W$                -> @
	\\s      -> Espacio en blanco              Ej: ^\\s$                -> " "
	\\S      -> No espacio                     Ej: ^\\S$                -> A
	.        -> Cualquier carácter             Ej: ^.$                  -> A, 5, @

	------------------------------------------

	CONJUNTOS

	[abc]       -> a, b o c                    Ej: ^[abc]$              -> b
	[a-z]       -> Minúscula                   Ej: ^[a-z]$              -> m
	[A-Z]       -> Mayúscula                   Ej: ^[A-Z]$              -> M
	[0-9]       -> Número                      Ej: ^[0-9]$              -> 7
	[a-zA-Z]    -> Letra                       Ej: ^[a-zA-Z]$           -> Z
	[^abc]      -> Excepto a,b,c               Ej: ^[^abc]$             -> d

	------------------------------------------

	REPETICIONES

	*        -> 0 o más veces                  Ej: ^a*$                 -> "", aaaa
	+        -> 1 o más veces                  Ej: ^a+$                 -> aaaa
	?        -> 0 o 1 vez                      Ej: ^a?$                 -> "", a

	{n}      -> Exactamente n veces            Ej: ^\\d{4}$             -> 1234
	{n,}     -> n o más veces                  Ej: ^\\d{4,}$            -> 12345
	{n,m}    -> Entre n y m veces              Ej: ^\\d{2,4}$           -> 123

	------------------------------------------

	ANCLAJES

	^        -> Inicio de cadena               Ej: ^hola                -> hola mundo
	$        -> Fin de cadena                  Ej: hola$                -> mi hola
	^...$    -> Cadena completa                Ej: ^hola$               -> hola

	------------------------------------------

	AGRUPACIÓN Y ALTERNATIVAS

	(exp)    -> Grupo                          Ej: ^(ab)+$              -> abab
	a|b      -> a o b                          Ej: ^(java|python)$      -> java

	------------------------------------------

	EJEMPLOS TÍPICOS DE EXAMEN

	Solo letras
	^[a-zA-Z]+$                                -> Pepe

	Solo números
	^\\d+$                                      -> 12345

	Código empleado
	^[A-Z]{3}-\\d{4}$                           -> ABC-1234

	Matrícula
	^\\d{4}-[A-Z]{3}$                           -> 1234-ABC

	DNI
	^\\d{8}[A-Z]$                               -> 12345678Z

	Fecha (dd/mm/yyyy)
	^\\d{2}/\\d{2}/\\d{4}$                      -> 25/12/2025

	Usuario (5 a 12 caracteres)
	^[a-z0-9]{5,12}$                           -> usuario123

	Email simple
	^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$ -> alumno@gmail.com

	==========================================
	""");

	}
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String texto = sc.nextLine();

        // 1. Solo letras
        System.out.println("1. Comprueba que incluye solo letras: "
                + texto.matches(""));

        // 2. Solo números
        System.out.println("2. Solo números: "
                + texto.matches(""));

        // 3. Tres letras mayúsculas, guion y cuatro números
        // Ejemplo: ABC-1234
        System.out.println("3. Código empleado según el formato indicado: "
                + texto.matches(""));

        // 4. Cuatro números, guion y tres letras mayúsculas
        // Ejemplo: 1234-ABC
        System.out.println("4. Matrícula: "
                + texto.matches(""));

        // 5. Usuario entre 5 y 12 caracteres
        // Solo minúsculas y números
        System.out.println("5. Usuario: "
                + texto.matches(""));

        // 6. DNI simplificado
        // Ejemplo: 12345678A
        System.out.println("6. DNI: "
                + texto.matches(""));

        // 7. Fecha dd/mm/yyyy
        // Ejemplo: 25/12/2025
        System.out.println("7. Fecha: "
                + texto.matches(""));

        // 8. Email simple
        // Ejemplo: pepe@gmail.com
        System.out.println("8. Email: "
                + texto.matches(""));

        sc.close();
    }
}