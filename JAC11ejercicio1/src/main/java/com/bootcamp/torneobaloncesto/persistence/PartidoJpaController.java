/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp.torneobaloncesto.persistence;

import com.bootcamp.torneobaloncesto.logic.Partido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Alicia
 */
public class PartidoJpaController {

    private EntityManagerFactory emf = null;

    /**
     * Obtener unidad de persistencia
     */
    public PartidoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("torneoBaloncestoJspPU");
    }

    /**
     * Manejador de conexión con la base de datos
     *
     * @return
     */
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    /**
     * Método que permite crear en la base de datos
     *
     * @param partido
     */
    public void create(Partido partido) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(partido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    /**
     * Método que permite listar el contenido de la base de datos.
     *
     * @return arraylist
     */
    public List<Partido> findPartidoEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Partido.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

}
