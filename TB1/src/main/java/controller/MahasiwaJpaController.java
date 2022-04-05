/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.exceptions.NonexistentEntityException;
import controller.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Mahasiwa;

/**
 *
 * @author PRISMA
 */
public class MahasiwaJpaController implements Serializable {

    public MahasiwaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Mahasiwa mahasiwa) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(mahasiwa);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMahasiwa(mahasiwa.getNrp()) != null) {
                throw new PreexistingEntityException("Mahasiwa " + mahasiwa + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Mahasiwa mahasiwa) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            mahasiwa = em.merge(mahasiwa);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = mahasiwa.getNrp();
                if (findMahasiwa(id) == null) {
                    throw new NonexistentEntityException("The mahasiwa with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mahasiwa mahasiwa;
            try {
                mahasiwa = em.getReference(Mahasiwa.class, id);
                mahasiwa.getNrp();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mahasiwa with id " + id + " no longer exists.", enfe);
            }
            em.remove(mahasiwa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Mahasiwa> findMahasiwaEntities() {
        return findMahasiwaEntities(true, -1, -1);
    }

    public List<Mahasiwa> findMahasiwaEntities(int maxResults, int firstResult) {
        return findMahasiwaEntities(false, maxResults, firstResult);
    }

    private List<Mahasiwa> findMahasiwaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Mahasiwa.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Mahasiwa findMahasiwa(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mahasiwa.class, id);
        } finally {
            em.close();
        }
    }

    public int getMahasiwaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Mahasiwa> rt = cq.from(Mahasiwa.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
