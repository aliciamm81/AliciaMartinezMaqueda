public class Main {
    public static void main(String[] args) {
        /*
         *Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String.
         * Asigna un valor a cada variable y muestra su contenido en la consola.
         * */

        
        //Declaración de variables
        int nEntero;
        double nReal;
        boolean booleano;
        String cadenaCaracteres;

        //Asignación de valores
        nEntero = 32;
        nReal = 3.1415;
        booleano = false;
        cadenaCaracteres = "Hola, esto es una cadena de caracteres.";

        //Imprimimos por pantalla los valores
        System.out.println("Valor de la variable de tipo int: " + nEntero);
        System.out.println("Valor de la variable de tipo double: " + nReal);
        System.out.println("Valor de la variable de tipo boolean: " + booleano);
        System.out.println("Valor de la variable de tipo String: " + cadenaCaracteres);

        /*
         * Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double…
         * ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no?
         * Justificar el por qué de cada caso. Debatir con otros compañeros.
         * */
        //Asignamos el valor y mostramos por pantalla el resultado, dejando comentados los valores que producen error
        //Primero con el tipo int
        nEntero = 'h';
        System.out.println("Resultado de asignar a una variable de tipo int el valor 'h': " + nEntero);
        //nEntero = "dda";
        //nEntero = 63.25;
        //nEntero = 13.59f;
        //nEntero = true;
        //nEntero = null;

        //Segundo con el tipo double
        nReal = 13;
        System.out.println("Resultado de asignar a una variable de tipo double el valor 13: " + nReal);
        nReal = 57.23f;
        System.out.println("Resultado de asignar a una variable de tipo double el valor 57.23f: " + nReal);
        nReal = 'p';
        System.out.println("Resultado de asignar a una variable de tipo double el valor 'p': " + nReal);
        //nReal = "cadena de caracteres";
        //nReal = true;
        //nReal = null;

        //Tercero con el tipo boolean
        //booleano = 1;
        //booleano = 1.03;
        //booleano = 2.56f;
        //booleano = 'Y';
        //booleano = "prueba";
        //booleano =  null;

        //Cuarto con el tipo String
        //cadenaCaracteres = 'J';
        //cadenaCaracteres = 25;
        //cadenaCaracteres = 23.069;
        //cadenaCaracteres = 14.25f;
        //cadenaCaracteres = 'J'+'o'; Este caso es curioso porque en lugar de hacer concatenación de caracteres en un Strng, hace suma de los valores enteros
        //cadenaCaracteres = false;
        cadenaCaracteres = null;
        System.out.println("Resultado de asignar a una variable de tipo String el valor null: " + cadenaCaracteres);
    }
}