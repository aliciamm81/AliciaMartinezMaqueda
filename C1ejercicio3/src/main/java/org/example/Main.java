/*Escribe un programa que permita calcular el área de un
triángulo y luego mostrar el resultado por pantalla..
Recuerda que la fórmula para calcular esto es:
(base * altura) / 2 (base por altura dividido dos).*/

package org.example;

public class Main {
    public static void main(String[] args) {

        // Declaro las variables que voy a necesitar
        double base = 12.5;
        double altura = 12.5;

        // Realizo el cálculo del area.
        double area = (base * altura) /2;

        //Imprimo por pantalla
        System.out.println("El area del triangulo es: " + area + "cm");

    }
}