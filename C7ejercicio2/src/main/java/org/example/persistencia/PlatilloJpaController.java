package org.example.persistencia;

import org.example.logica.Platillo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class PlatilloJpaController {
    private EntityManagerFactory emf = null;

    public PlatilloJpaController() {
        //Obtener la unidad de persistencia
        this.emf = Persistence.createEntityManagerFactory("restaurantePU");
    }

    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public void create(Platillo platillo){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.persist(platillo);
        em.getTransaction().commit();

    }
    public void destroy (Integer id){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        Platillo platillo = em.find(Platillo.class, id);
        em.remove(platillo);
        em.getTransaction().commit();

    }

    public void edit (Platillo platillo){
        EntityManager em = null;
        em = getEntityManager();
        em.getTransaction().begin();
        em.merge(platillo);
        em.getTransaction().commit();
    }

    public List<Platillo> findPlatilloEntities(){
        EntityManager em = null;
        em = getEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Platillo.class));
        Query q = em.createQuery(cq);
        return q.getResultList();
    }

}
