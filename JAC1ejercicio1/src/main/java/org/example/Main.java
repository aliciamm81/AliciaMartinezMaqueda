package org.example;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     * Variables globales
     */
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Vuelo> listaVuelos = new ArrayList<>();
    static ArrayList<Reserva> listaReservas = new ArrayList<>();
    static Integer secuencia = 1;

    public static void main(String[] args) {
        /**
         * Creo un ArratList con la lista de vuelos disponibles.
         */
        listaVuelos.add(new Vuelo(1, "Paris", 50, 8, LocalDate.of(2023, 12, 1)));
        listaVuelos.add(new Vuelo(2, "China", 50, 5, LocalDate.of(2023, 11, 5)));
        listaVuelos.add(new Vuelo(3, "NuevaYork", 50, 2, LocalDate.of(2023, 12, 3)));
        listaVuelos.add(new Vuelo(4, "Grecia", 50, 0, LocalDate.of(2023, 12, 8)));
        /**
         * Inicio de la aplicación, se solicta al usuario que marque una opción y se muestra
         * al usuario por pantalla la lista de los vuelos disponibles.
         * Sí selecciona la tecla "+" llama a los métodos que crean la reserva, cuando finaliza
         * la primera reserva se vuelve a solicitar que marque una opción, si marca "+" vuelve a
         * iniciar una nueva reserva, si por el contrario marca cualquier tecla sale de la aplicación
         */
        System.out.println("***************** RESERVA DE VUELOS *****************");
        System.out.println("LISTA DE VUELOS:");
        for (Vuelo vuelo:listaVuelos) {
            System.out.println(vuelo.toString());
        }
        System.out.println("\nPara iniciar la reserva pulsa => \"+\" | Para salir pulsa cualquier tecla");
        String opcion = sc.nextLine();

        while (opcion.equals("+")) {
            try {
                Reserva reserva = reservar();
                listaReservas.add(reserva);
                System.out.println("La reserva se ha realizado con exito:");
                System.out.println(reserva.toString());
            } catch (ReservaInvalidaException e) {
                System.out.println("Error al realizar la reserva: " + e.getMessage());
            }

            System.out.println("Para realizar más reservas pulsa \"+\" | Para terminar pulsa cualquier tecla");
            opcion = sc.nextLine();
        }
        System.out.println("***** HASTA PRONTO *****");
    }

    /**
     * Método que devuelve un objeto del tipo Reserva, solicita al usuario datos de la reserva por pantalla,
     * comprueba que los datos introducidos son válidos y que existen vuelos con esas características.
     * Si no son válidos devolverá una excepción y si son válidos almacenará los valores
     * en un objeto del tipo Reserva.
     *
     * @throws ReservaInvalidaException
     */
    public static Reserva reservar() throws ReservaInvalidaException {

        Reserva reserva = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce un destino: ");
        String destino = sc.nextLine().toLowerCase();
        try {
            System.out.println("Introduce una fecha en el siguiente orden, 1ºaño, 2ºmes, 3ºdia");
            LocalDate fecha = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());

            System.out.println("Introduce la cantidad de asientos: ");
            int cantAsientos = sc.nextInt();
            for (Vuelo vuelo : listaVuelos) {
                if (vuelo.getDestino().equals(destino) && vuelo.getFecha().equals(fecha)) {
                    if (vuelo.getNumAsientosDisponibles() < cantAsientos) {
                        throw new ReservaInvalidaException("No hay suficientes asientos disponibles");
                    }
                    reserva = new Reserva();
                    reserva.setId(secuencia);
                    reserva.setCantAsientos(cantAsientos);
                    reserva.setDestino(destino);
                    reserva.setNombre(nombre);
                    reserva.setFecha(fecha);

                    secuencia++;
                    vuelo.setNumAsientosDisponibles(vuelo.getNumAsientosDisponibles() - cantAsientos);
                    break;
                }
            }
            if (reserva == null) {
                throw new ReservaInvalidaException("No hay vuelos con este destino o fecha");
            }
            return reserva;

        } catch (InputMismatchException e) {
            throw new InputMismatchException("Los datos de fecha y asientos tienen que ser numéricos");
        } catch (DateTimeException e) {
            throw new DateTimeException("Formado de fecha inválido, tiene que introducirse en el siguiente orden: AÑO/MES/DIA");
        }
    }
}