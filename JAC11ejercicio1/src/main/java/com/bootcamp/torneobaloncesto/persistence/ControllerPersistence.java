/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp.torneobaloncesto.persistence;

import com.bootcamp.torneobaloncesto.logic.Equipo;
import com.bootcamp.torneobaloncesto.logic.Partido;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author Alicia
 */
public class ControllerPersistence {

    EquipoJpaController equipoJpa = new EquipoJpaController();
    PartidoJpaController partidoJpa = new PartidoJpaController();

    /**
     * Método que dado un objeto empleado llama al controlador que permite crear
     * un equipo en la base de datos
     *
     * @param equipo
     */
    public void createEquipo(Equipo equipo) {
        try {
            equipoJpa.create(equipo);
            System.out.println("Registro creado correctamente");

        } catch (Exception e) {
            System.out.println("No se ha podido crear el registro");

        }
    }

    /**
     * Método que dado un objeto empleado llama al controlador que permite crear
     * un partido en la base de datos
     *
     * @param partido
     */
    public void createPartido(Partido partido) {
        try {
            if (partido.getEquipoLocal() != null && partido.getEquipoVisitante() != null) {
                partidoJpa.create(partido);
                System.out.println("Registro creado correctamente");
            } else {
                System.out.println("Los id de los equipos introducidos no son válidos");
            }

        } catch (NumberFormatException e) {
            System.out.println("No se ha podido crear el registro");

        }
    }

    /**
     * Método que llama al controlador que devuelve una lista de esquipos
     *
     * @return
     */
    public List<Equipo> findEquipos() {
        return equipoJpa.findEquipoEntities();
    }

    /**
     * Método que llama al controlador que devuelve una lista de partidos
     *
     * @return
     */
    public List<Partido> findPartidos() {
        return partidoJpa.findPartidoEntities();
    }

    /**
     *
     * Método que dado un id lo pasa como parámetro al método del controlador
     * que busca si hay registros coincidentes
     *
     * @param id
     * @return
     */
    public Equipo findEquipoId(Integer id) {
        try {
            return equipoJpa.read(id);
        } catch (NoResultException e) {
            System.out.println("No existen registros con el id introducido");
            return null;
        }
    }

}
