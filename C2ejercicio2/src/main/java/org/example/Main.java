/**
 * a) Imagina que eres un cajero en un supermercado.
 * Crea un programa en Java que permita ingresar el precio de varios productos comprados
 * por un cliente. Utiliza una estructura repetitiva (la que quieras) para continuar
 * pidiendo precios hasta que el usuario decida finalizar. Luego, muestra el total
 * de la compra que debe abonar.
 **/

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaro dos variables una que almacenará el importe que ingrese el
        // usuario y otra que almacenará el total de la compra.

        int importe = 0;
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        // Creo un bucle do while que solicitará al usuario un importe y lo irá suamando
        // en la variable total, cuando el usuario marque un 0 sale del buble y muestra
        // el resultado.

        do {
            System.out.println("Ingresa el importe, para finalizar marca el 0");
            importe = scanner.nextInt();
            total += importe;

        }while(importe != 0);

        System.out.println("El importe total de tu compra es: " + total + " €");

    }
}

