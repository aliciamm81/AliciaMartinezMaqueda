/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bootcamp.torneobaloncesto.persistence;

import com.bootcamp.torneobaloncesto.logic.Equipo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Alicia
 */
public class EquipoJpaController {

    private EntityManagerFactory emf = null;

    /**
     * Obtener unidad de persistencia
     */
    public EquipoJpaController() {
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
     * @param equipo
     */
    public void create(Equipo equipo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(equipo);
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
    public List<Equipo> findEquipoEntities() {

        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Equipo.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

    /**
     * Método que permite buscar un equipo por su id.
     *
     * @param id
     * @return object
     */
    public Equipo read(Integer id) {
        EntityManager em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        Root<Equipo> root = cq.from(Equipo.class);
        cq.select(root).where(root.get("id").in(id));
        Query q = em.createQuery(cq);
        return (Equipo) q.getSingleResult();
    }
}
