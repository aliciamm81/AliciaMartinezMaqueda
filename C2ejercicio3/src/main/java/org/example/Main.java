/**
 * Una web de meteorología necesita de un programa que,
 * al ingresar las 7 temperaturas máximas de la última semana,
 * calcule la temperatura máxima promedio que hubo.
 * Para ello, deberá manejar un vector donde en cada posición se almacene
 * la correspondiente temperatura máxima de cada día. Una vez almacenadas
 * las temperaturas, deberá calcular el promedio de las mismas recorriendo
 * el vector y mostrando el resultado por pantalla.
 * */

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creo las variables necesarias, un array para las temperaturas,
        //un acumulador y un contador.

        int[] temperaturas = new int[7];
        int totalTemperaturas = 0;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        //Creo un buble for para recorrer el array e ir
        //guardando en el los valores que el usuario introduzca por pantalla.
        //También voy sumando las veces que da vueltas el bucle en la variable contador

        for (int i = 0; i < temperaturas.length; i++) {
            contador++;
            System.out.println("Introduce una temperatura: ");
            temperaturas[i] = scanner.nextInt();
            totalTemperaturas += temperaturas[i];
        }

        System.out.println("Lista de temperaturas máximas: ");

        //Creo este for para imprimir por pantalla los valores que se
        //han almacenado en el array

        for (int j = 0; j < temperaturas.length; j++) {

            System.out.print( temperaturas[j] + " | ");
        }

        //Muestro por pantalla el promedio
        System.out.println("\nEl promedio de las temperaturas máximas es: " + totalTemperaturas/contador);
    }
}