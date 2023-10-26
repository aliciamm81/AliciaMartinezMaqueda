package org.example;

public class Main {
    public static void main(String[] args) {

        //a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        Electrodomestico electrodomestico1 = new Electrodomestico(1,"Aeg","3VS506BP",1.8,"blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(2,"Bosh","5B25544MK10",0.92,"gris");
        Electrodomestico electrodomestico3 = new Electrodomestico(3,"Fagor","2536DHDHD4545645",3.6,"blanco");

        //b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        Electrodomestico electrodomestico4 = new Electrodomestico();

        //c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        System.out.println("Electrodomésticos: ");
        System.out.println("Marca: " + electrodomestico1.getMarca() + " | Modelo: "+ electrodomestico1.getModelo() + " | Consumo: " + electrodomestico1.getConsumo() + " kWh/hora");
        System.out.println("Marca: " + electrodomestico2.getMarca() + " | Modelo: "+ electrodomestico2.getModelo() + " | Consumo: " + electrodomestico2.getConsumo() + " kWh/hora");
        System.out.println("Marca: " + electrodomestico3.getMarca() + " | Modelo: "+ electrodomestico3.getModelo() + " | Consumo: " + electrodomestico3.getConsumo() + " kWh/hora");

        //d) Intenta obtener la marca del electrodoméstico creado sin parámetros.
        // ¿Se obtiene algún valor? Sí De ser así… ¿Qué valor se obtiene? se obtiene valor null.
        System.out.println("\nElectrodoméstico sin parámetros: \nMarca: " + electrodomestico4.getMarca() );

    }


}