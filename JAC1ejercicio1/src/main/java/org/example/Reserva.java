package org.example;

import java.lang.reflect.Array;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reserva {
    private Integer id;
    private String nombre;
    private String destino;
    private LocalDate fecha;
    private Integer cantAsientos;


    public Reserva() {
    }

    public Reserva(Integer id, String nombre, String destino, LocalDate fecha, Integer cantAsientos) {
        this.id = id;
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
        this.cantAsientos = cantAsientos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ReservaInvalidaException {
        if (nombre.length() == 0) {
            throw new ReservaInvalidaException("El nombre no puede estar vacío");
        } else if (nombre.matches("^[A-Za-z][a-zA-Z\s]{3,}$")) {
            throw new ReservaInvalidaException("El nombre no puede contener números");
        } else {
            this.nombre = nombre;
        }
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino.toLowerCase();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(Integer cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    @Override
    public String toString() {
        return "********* Reserva: *********\n" +
                "Id = " + id + "\n" +
                "Nombre = " + nombre + "\n" +
                "Destino = " + destino + "\n" +
                "Fecha = " + fecha + "\n" +
                "CantAsientos = " + cantAsientos +
                "****************************" ;
    }

}
