package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaro las variables que voy a necesitar
        int num1,num2;
        //Importo la clase scanner para la entrada de datos en consola.
        Scanner scanner = new Scanner(System.in);
        //Muestro el mensaje al usuario para que ingrese el primer número
        // y lo guardo en la variable num1.
        System.out.println("Introduce un número entero");
        num1 = scanner.nextInt();
        //Muestro otro mensaje al usuario para que ingrese segundo número
        // y lo guardo en la variable num2.
        System.out.println("Introduce otro número entero diferente a 0");
        num2 = scanner.nextInt();

        //Declaro las variables para realizar las operaciones matemáticas
        // y las inicializo con los resultados de las operaciones.

        int sum = num1 + num2;
        int rest = num1 - num2;
        int mult = num1 * num2;
        double div = num1 / num2;

        //Imprimo por consola los resultados de cada una de las operaciones.

        System.out.println("El resultado de la suma es: " + sum +
                           "\nEl resultado de la resta es: " + rest +
                           "\nEl resultado de la multiplicacion es: " + mult +
                           "\nEl resultado de la division es: " + div);

    }
}