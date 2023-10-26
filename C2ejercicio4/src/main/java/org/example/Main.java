import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Imagina que estás trabajando en un sistema de reservas de asientos para un teatro.
         * Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
         *Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
         *Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2").
         * El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
         *Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
         *A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
         *Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro.
         * ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?
         *El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
         * */

        //Declaración de variables
        char[][] asientos = new char[5][5];
        int fila, columna, contador = 0;
        String centinela = "";
        Scanner scanner = new Scanner(System.in);

        //Inicializamos los asientos para que estén todos vacíos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asientos[i][j] = 'O';
            }
        }


        //Reserva de asientos
        System.out.println("Vamos a proceder a la reserva de asientos. Por favor, introduzca un valor inferior a 1" +
                " o superior a 5 para cancelar su reserva.");
        do {
            //Mostramos el mapa de asientos para que el usuario escoja
            System.out.println("Escoja su asiento:");

            for (int nColumna = 1; nColumna <= 5; nColumna++) {
                System.out.print("  " + nColumna);
            }

            System.out.println();

            for (int i = 0; i < 5; i++) {

                int nFila = i + 1;
                System.out.print(nFila + " ");

                for (int j = 0; j < 5; j++) {
                    System.out.print(asientos[i][j] + "  ");
                }

                System.out.println();

            }

            System.out.println("¿En qué fila quieres sentarte?");
            fila = scanner.nextInt();

            System.out.println("¿En qué columna quieres sentarte?");
            columna = scanner.nextInt();
            scanner.nextLine();

            if ((fila >= 1 && fila <= 5) && (columna >= 1 && columna <= 5)) {

                fila--;
                columna--;

                if (asientos[fila][columna] == 'O') {

                    asientos[fila][columna] = 'X';
                    System.out.println("Su reserva se realizó con éxito.");

                } else {

                    System.out.println("Lo lamento, el asiento seleccionado está ocupado. Pruebe a seleccionar otro.");

                }


                System.out.println("¿Quiere realizar otra reserva? Pulse N para salir o cualquier otra cosa para continuar.");
                centinela = scanner.nextLine();
                if (!centinela.isEmpty()) {
                    centinela = centinela.toUpperCase().substring(0, 1);
                } else {
                    centinela = "N";
                }

            } else {
                System.out.println("Reserva cancelada. Me debe 100€.");
                centinela = "N";
            }

        } while (!centinela.equals("N"));

    }
}