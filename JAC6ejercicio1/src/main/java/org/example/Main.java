package org.example;

public class Main {
    public static void main(String[] args) {
        Inventario<Auto> inventario = new Inventario<>();
        inventario.agregarAuto(new Auto("Opel", "Corsa", 2000, 5298.50));
        inventario.agregarAuto(new Auto("Toyota", "Yaris", 2000, 6500.25));
        inventario.agregarAuto(new Auto("Ford", "Fiesta", 2012, 4800.75));
        inventario.agregarAuto(new Auto("Honda", "Civic", 2018, 8900.00));

        inventario.buscarAutosAno(2000);
        inventario.buscarAutosMarca("Toyota");
        inventario.valorTotalInventario();

    }
}