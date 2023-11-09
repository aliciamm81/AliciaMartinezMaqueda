package org.example;

public class Main {
    public static void main(String[] args) {
        Agente agente1 = new Agente("Pedro");
        Agente agente2 = new Agente("María");
        Agente agente3 = new Agente("Juan");
        Agente agente4 = new Agente("Laura");

        Thread hilo1 = new Thread(agente1);
        Thread hilo2 = new Thread(agente2);
        Thread hilo3 = new Thread(agente3);
        Thread hilo4 = new Thread(agente4);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}