Ejercicio realizado por: Alicia Martínez y Jorge Villaplana

Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double…
¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no?
Justificar el por qué de cada caso. Debatir con otros compañeros.

--- Casos probados
        //Primero con el tipo int
        nEntero = 'h';
        System.out.println("Resultado de asignar a una variable de tipo int el valor 'h': " + nEntero); -> Resultado de asignar a una variable de tipo int el valor 'h': 104
(Justificación: la variable muestra el código ASCII del caracter asignado.)
        //nEntero = "dda";
        //nEntero = 63.25;
        //nEntero = 13.59f;
        //nEntero = true;
        //nEntero = null;

        //Segundo con el tipo double
        nReal = 13;
        System.out.println("Resultado de asignar a una variable de tipo double el valor 13: " + nReal); -> Resultado de asignar a una variable de tipo double el valor 13: 13.0
(Justificación: la variable muestra el valor entero convertido a double, agregándole un decimal al formato.)
        nReal = 57.23f;
        System.out.println("Resultado de asignar a una variable de tipo double el valor 57.23f: " + nReal); -> Resultado de asignar a una variable de tipo double el valor 57.23f: 57.22999954223633
(Justificación: la variable muestra el valor más cercano capaz de aproximar, como si intentase adivinar el valor del cual se ha hecho un redondeo. En este caso entendemos que la cantidad de decimales se debe a la longitud que es capaz de almacenar un tipo double.)
        nReal = 'p';
        System.out.println("Resultado de asignar a una variable de tipo double el valor 'p': " + nReal); -> Resultado de asignar a una variable de tipo double el valor 'p': 112.0
(Justificación: la variable muestra el código ASCII del caracter asignado.)
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
        //cadenaCaracteres = 'J'+'o'; Este caso es curioso porque en lugar de intentar hacer concatenación de caracteres en un Strng, hace suma de los valores enteros
        //cadenaCaracteres = false;
        cadenaCaracteres = null;
        System.out.println("Resultado de asignar a una variable de tipo String el valor null: " + cadenaCaracteres); -> Resultado de asignar a una variable de tipo String el valor null: null
(Justificación: la variable muestra directamente 'null' porque directamente considera que está completamente vacía, y todos los 'objetos' o clases vacíos arrojan null.)