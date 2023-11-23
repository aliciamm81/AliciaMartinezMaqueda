/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupoestudiantes.jac10ejercicio1.persistence;

import com.grupoestudiantes.jac10ejercicio1.logic.Vote;
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
public class VoteJpaController {

    private EntityManagerFactory emf = null;

    public VoteJpaController() {
        emf = Persistence.createEntityManagerFactory("vote");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Vote vote) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(vote);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void update(Vote vote) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(vote);
        em.getTransaction().commit();
    }

    public List<Vote> findVoteEntities() {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Vote.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

}
