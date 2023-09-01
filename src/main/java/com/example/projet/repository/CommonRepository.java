package com.example.projet.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import java.util.function.Function;

public abstract class CommonRepository<T,ID> {

    private EntityManagerFactory emf;
    private Class<T> clazz;

    protected CommonRepository(EntityManagerFactory emf,Class<T> clazz) {
        this.emf = emf;
        this.clazz = clazz;
    }

    public T create(T entity) {
        return query((em) -> {
            em.persist(entity);
            em.flush();
            return entity;

        });
    }

    public List<T> findAll() {
        return query((em) -> {
            return em.createQuery("select t from "+clazz.getName()+" t",clazz).getResultList();
        });
    }

    public T findById(ID id) {
        return query((em) -> {
            return em.find(clazz,id);
        });
    }

    public Boolean update(T entity) {
        return query((em) -> {
            em.merge(entity);
            return true;
        });
    }

    public Boolean deleteById(ID id) {
        return query((em) -> {
            em.remove(em.find(clazz, id));
            return true;
        });
    }



    protected <R> R query(Function<EntityManager,R> query) {
        EntityManager em = null;
        EntityTransaction tx = null;
        R entity = null;
        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            entity = query.apply(em);

            tx.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return entity;
    }
}

