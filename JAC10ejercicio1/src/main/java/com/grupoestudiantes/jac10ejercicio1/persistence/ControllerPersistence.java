/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupoestudiantes.jac10ejercicio1.persistence;

import com.grupoestudiantes.jac10ejercicio1.logic.Vote;
import java.util.List;

/**
 *
 * @author Alicia
 */
public class ControllerPersistence {

    VoteJpaController voteJpa = new VoteJpaController();

    public void createVote(Vote vote) {
        try {
            voteJpa.create(vote);
            System.out.println("Registro creado correctamente");

        } catch (Exception e) {
            System.out.println("No se ha podido crear el registro");

        }
    }

    public List<Vote> findVote() {
        return voteJpa.findVoteEntities();
    }

    public void updateVote(Vote vote) {
        try {
            voteJpa.update(vote);
            System.out.println("El voto con nombre: " + vote.getName() + " Se ha modificado correctamente");
        } catch (Exception e) {
            System.out.println("No se ha podido modificar el registro o no existe");
        }
    }

}
