package org.example;

import java.util.Calendar;

public abstract class Vehiculo {
    protected int id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double costo;

    public Vehiculo(int id, String placa, String marca, String modelo, int ano, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Integer calcularAntiguedad() {
        Calendar cal = Calendar.getInstance();
        return (cal.get(Calendar.YEAR) - this.ano);
    }



}


