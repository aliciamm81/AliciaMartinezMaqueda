/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp.torneobaloncesto.logic;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Alicia
 */
@Entity
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate fecha;
    private Integer resultadoLocal;
    private Integer resultadoVisitante;

    @ManyToOne
    @JoinColumn(name = "EQUIPO_LOCAL_ID")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "EQUIPO_VISITANTE_ID")
    private Equipo equipoVisitante;

    public Partido(LocalDate fecha, Integer resultadoLocal, Integer resultadoVisitante, Equipo equipoLocal, Equipo equipoVisitante) {
        this.fecha = fecha;
        this.resultadoLocal = resultadoLocal;
        this.resultadoVisitante = resultadoVisitante;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public Partido() {
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getResultadoLocal() {
        return resultadoLocal;
    }

    public void setResultadoLocal(Integer resultadoLocal) {
        this.resultadoLocal = resultadoLocal;
    }

    public Integer getResultadoVisitante() {
        return resultadoVisitante;
    }

    public void setResultadoVisitante(Integer resultadoVisitante) {
        this.resultadoVisitante = resultadoVisitante;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    @Override
    public String toString() {
        return "Partido{" + "id=" + id + ", fecha=" + fecha + ", resultadoLocal=" + resultadoLocal + ", resultadoVisitante=" + resultadoVisitante + ", equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + '}';
    }

}
