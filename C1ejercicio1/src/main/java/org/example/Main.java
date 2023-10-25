/* a) Escribir un programa en Java que muestre por pantalla un mensaje de
Bienvenida a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.*/

package org.example;

public class Main {
    public static void main(String[] args) {
        /*Creo un mensaje de Bienvenida*/
        System.out.println("Hola, Bienvenido al sistema");

/*  b) Una vez logrado esta primera parte, permitir que se almacene el nombre del
usuario en una variable y se muestre el mismo en el mensaje.
Por ejemplo: “Hola Eduardo, bienvenida al sistema”.*/

        /*Declaro una variable y la inicializo con un nombre para
        después imprimir por pantalla el mensaje con el valor de la variable*/
        String name = "Alicia Martinez";
        System.out.println("Hola, " + name + " Bienvenida al sistema");;
    }
}