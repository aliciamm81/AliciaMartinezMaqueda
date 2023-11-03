package org.example;

import java.util.Calendar;

public class Moto extends Vehiculo implements Combustion{
    private double cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int año, double costo, double cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Moto con recarga de combustible completada");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", id=" + id +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", costo=" + costo +
                '}';
    }


}
