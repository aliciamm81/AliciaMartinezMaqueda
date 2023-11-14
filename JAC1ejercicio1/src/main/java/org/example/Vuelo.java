package org.example;

import java.time.LocalDate;

public class Vuelo {

    private Integer id;
    private String destino;
    private Integer numAsientos;
    private Integer numAsientosDisponibles;
    private LocalDate fecha;

    public Vuelo() {
    }

    public Vuelo(Integer id, String destino, Integer numAsientos, Integer numAsientosDisponibles, LocalDate fecha) {
        this.id = id;
        this.destino = destino.toLowerCase();
        this.numAsientos = numAsientos;
        this.numAsientosDisponibles = numAsientosDisponibles;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(Integer numAsientos) {
        this.numAsientos = numAsientos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getNumAsientosDisponibles() {
        return numAsientosDisponibles;
    }

    public void setNumAsientosDisponibles(Integer numAsientosDisponibles) {
        this.numAsientosDisponibles = numAsientosDisponibles;
    }

    @Override
    public String toString() {
        return  "Id = " + id +
                ", Destino = '" + destino + '\'' +
                ", Nº asientos = " + numAsientos +
                ", Nº asientos libres = " + numAsientosDisponibles +
                ", Fecha = " + fecha;
    }
}
