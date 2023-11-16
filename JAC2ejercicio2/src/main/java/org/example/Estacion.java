package org.example;

import java.util.ArrayList;
import java.util.List;

public class Estacion implements Runnable {

    private String tipo;
    private List<Trabajador> trabajadores;

    public Estacion(String tipo, List<Trabajador> trabajadores) {
        this.tipo = tipo;
        this.trabajadores = trabajadores;
    }

    public synchronized void ensamblar(Trabajador t) {
        System.out.println("El trabajador con nombre: " + t.getNombre() + " Esta ensamblando un producto");
    }

    public synchronized void controlarCalidad(Trabajador t) {
        System.out.println("El trabajador con nombre: " + t.getNombre() + " Esta realizando un control de calidad");
    }

    public synchronized void embalarProducto(Trabajador t) {
        System.out.println("El trabajador con nombre: " + t.getNombre() + " Esta realizando embalajes de productos");
    }

    @Override
    public void run() {
        for (Trabajador t : trabajadores) {
            switch (tipo) {
                case "embalar":
                    embalarProducto(t);
                    break;
                case "ensamblar":
                    ensamblar(t);
                    break;
                case "calidad":
                    controlarCalidad(t);
                    break;
            }
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
