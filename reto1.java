
/*
Reto consiste en encontrar la palabra mas larga de una frase y
 alternar cada caracter de la palabra con los caracteres de egf2yt3a59.
*/

import java.util.Scanner;

public class reto1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        System.out.println("Ingrese una cadena de texto:");
        String cadena = scanner.nextLine(); // Leer la cadena ingresada por el usuario

        String palabraMasLarga = obtenerPalabraMasLarga(cadena);
        System.out.println("La palabra más larga es: " + palabraMasLarga);

        // Definir el código para intercalar
        String codigo = "egf2yt3a59";

        // Intercalar la palabra más larga con el código
        String resultadoIntercalado = intercalarConCodigo(palabraMasLarga, codigo);
        System.out.println("Resultado intercalado: " + resultadoIntercalado);

        scanner.close(); // Cerrar el scanner
    }

    public static String obtenerPalabraMasLarga(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return ""; // Retorna una cadena vacía si la entrada es nula o vacía
        }

        String[] palabras = cadena.split("\\s+"); // Divide la cadena en palabras utilizando espacios como delimitadores
        String palabraMasLarga = "";

        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        return palabraMasLarga;
    }

    public static String intercalarConCodigo(String palabra, String codigo) {
        StringBuilder resultado = new StringBuilder();
        int maxLength = Math.max(palabra.length(), codigo.length());

        // Intercalar caracteres de la palabra y el código
        for (int i = 0; i < maxLength; i++) {
            if (i < palabra.length()) {
                resultado.append(palabra.charAt(i));
            }
            if (i < codigo.length()) {
                resultado.append(codigo.charAt(i));
            }
        }

        return resultado.toString();
    }
}