package org.example;

import org.graalvm.polyglot.io.MessageTransport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Trabajador trabajador1 = new Trabajador("Alfonso");
        Trabajador trabajador2 = new Trabajador("Alicia");
        Trabajador trabajador3 = new Trabajador("Felipe");
        Trabajador trabajador4 = new Trabajador("Sonia");
        Trabajador trabajador5 = new Trabajador("Julia");
        Trabajador trabajador6 = new Trabajador("Maria");

        Estacion estacion1 = new Estacion("embalar", List.of(trabajador1,trabajador2));
        Estacion estacion2 = new Estacion("ensamblar", List.of(trabajador3,trabajador4));
        Estacion estacion3 = new Estacion("calidad", List.of(trabajador5, trabajador6));

        Thread hilo1 = new Thread(estacion1);
        Thread hilo2 = new Thread(estacion2);
        Thread hilo3 = new Thread(estacion3);;

        hilo1.start();
        hilo2.start();
        hilo3.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}