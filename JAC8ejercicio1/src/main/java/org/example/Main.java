package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Vuelo> listaVuelos = new ArrayList<>();
    static ArrayList<Reserva> listaReservas = new ArrayList<>();

    public static void main(String[] args) {

        listaVuelos.add(new Vuelo(1, "Paris", 50, 8, LocalDate.of(2023, 12, 1)));
        listaVuelos.add(new Vuelo(2, "China", 50, 5, LocalDate.of(2023, 11, 5)));
        listaVuelos.add(new Vuelo(3, "NuevaYork", 50, 2, LocalDate.of(2023, 12, 3)));
        listaVuelos.add(new Vuelo(4, "Grecia", 50, 0, LocalDate.of(2023, 12, 8)));

        System.out.println("Si desea realizar una reserva pulsa \"+\"");
        String opcion = sc.nextLine();

        while (opcion.equals("+")) {
            Reserva reserva = new Reserva();
            try {
                reserva.reservar(listaVuelos);
                listaReservas.add(reserva);
                if(reserva == null){

                }else{
                    System.out.println("La reserva se ha realizado con exito:");
                    reserva.toString();
                }

            } catch (ReservaInvalidaException e) {
                System.out.println("Error al realizar la reserva: " + e.getMessage());
            }

            System.out.println("Para realizar más reservas pulsa \"+\" para terminar pulsa cualquier tecla");
            opcion = sc.nextLine();
        }

    }

//    private static void reservar() {
//        Reserva reserva = new Reserva();
//        System.out.println("Introduce un nombre: ");
//        String nombre = sc.nextLine();
//        System.out.println("Introduce un destino: ");
//        String destino = sc.nextLine();
//        System.out.println("Introduce una fecha: ");
//        LocalDate fecha = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
//        System.out.println("Introduce la cantidad de asientos: ");
//        int cantAsientos = sc.nextInt();
//
//        for (Vuelo vuelo : listaVuelos) {
//            if (vuelo.getDestino().equals("destino") && vuelo.getFecha().equals(fecha)) {
//                if (vuelo.getNumAsientos() < cantAsientos) {
//                    System.out.println(" No hay suficientes asientos disponibles");
//                }
//                reserva.setCantAsientos(cantAsientos);
//                reserva.setDestino(destino);
//                reserva.setNombre(nombre);
//                reserva.setFecha(fecha);
//
//            } else {
//                System.out.println("No hay vuelos con este destino o fecha");
//            }
//
//        }
//        listaReservas.add(reserva);
//        System.out.println("Reserva confirmada a nombre de => " + reserva.getNombre() +
//                                   " / Destido: " + reserva.getDestino() +
//                                   " / Fecha: " + reserva.getFecha() +
//                                   " / Números de asientos: " + reserva.getCantAsientos());
//    }
}