/*a) Una recital permite únicamente el ingreso de mayores de 18 años.
Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
El programa debe mostrar (según cada caso) un mensaje informando la situación.*/


package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaro la vairable donde almacenré el valor que introduzca el usuario
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        edad = scanner.nextInt();

        // Creo una condicional para comprobar si el usuario es mayor de edad o no y muestro un
        // mensaje diferente dependiendo de la edad.
        if(edad < 18) {
            System.out.println("No puedes ingresar al evento, con " + edad + " años eres menor de edad");
        }else{
            System.out.println("puedes ingresar al evento");
        }
    }
}