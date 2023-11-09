package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] datos = new String[2];
        boolean seguir = true;

        while (seguir) {
            Integer opcion = iniciar();
            switch (opcion) {
                case 1:
                    guardarDatos(datos);
                    break;
                case 2:
                    consultarDatos(datos);
                    break;
                case 3:
                    consultarDatosPorIndex(datos);
                    break;
                case 4:
                    System.out.println("***** HASTA PRONTO *****");
                    seguir = false;
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
                    break;
            }
        }
    }

    public static Integer iniciar() {
        System.out.println("************* LISTA DE DATOS *************");
        System.out.println("Selecciona una de las siguiente opciones: ");
        System.out.println("1 - Guardar datos en la lista");
        System.out.println("2 - Consultar todos los datos de la lista");
        System.out.println("3 - Consultar datos por índice");
        System.out.println("4 - Salir");
        try {
            Integer opcion = sc.nextInt();
            sc.nextLine();
            return opcion;
        } catch (InputMismatchException e) {
            System.out.println("Se ha introducido un tipo de dato no válido, solo se admiten tipos numéricos");
            return 4;
        }
    }
    public static void guardarDatos(String[] datos) {
        for (int i = 0; i != datos.length; i++) {
            System.out.println("Introduce un dato");
            datos[i] = sc.nextLine();
        }
    }
    public static void consultarDatos(String[] datos) {
        System.out.println("****** Datos de la lista ******");
        for (String dato : datos) {
            System.out.println(dato);
        }
    }

    public static void consultarDatosPorIndex(String[] datos) {
        try {
            System.out.println("Introduce el índice del valor que quieres consultar");
            Integer valor = sc.nextInt();

            try {
                System.out.println("El índice " + valor + " Contiene el siguiente dato: " + datos[valor - 1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("El índice no es válido");
            }

        } catch (InputMismatchException e) {
            System.out.println("Se ha introducido un tipo de dato no válido, solo se admiten tipos numéricos");
            sc.nextLine();
        }
    }

}