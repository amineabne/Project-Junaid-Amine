package com.example.projet.repository;

import com.example.projet.entity.Recette;

import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public class RecetteRepository extends CommonRepository<Recette, Integer> {

    public RecetteRepository(EntityManagerFactory emf) {
        super(emf, Recette.class);
    }

    public List<Recette> findAllByIds(List<Integer> ids) {
        return super.query((em) -> {
            TypedQuery<Recette> q = em.createQuery("select r from Recette r where id in :ids", Recette.class);
            q.setParameter("ids", ids);
            return q.getResultList();
        });
    }
}
