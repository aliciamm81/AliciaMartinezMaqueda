package org.example;

import java.util.Calendar;

public class Camioneta extends Vehiculo implements Combustion{
    private double capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }


    @Override
    public void recargarCombustible() {
        System.out.println("Camioneta con recarga de combustible completada");
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "capacidadTanque=" + capacidadTanque +
                ", consumoCombustible=" + consumoCombustible +
                ", id=" + id +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", costo=" + costo +
                '}';
    }
}
