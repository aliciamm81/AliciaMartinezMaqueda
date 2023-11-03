package org.example;

import java.util.Calendar;

public class Auto extends Vehiculo implements Electrico {
    private double capacidadBateria;
    private double autonomia;

    public Auto(int id, String placa, String marca, String modelo, int ano, double costo, double capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, ano, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Automóvil con recarga de energía completada");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "capacidadBateria=" + capacidadBateria +
                ", autonomia=" + autonomia +
                ", id=" + id +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", costo=" + costo +
                '}';
    }


}
