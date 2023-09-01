package com.example.projet.repository;

import com.example.projet.entity.User;
import com.example.projet.entity.User;

import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserRepository extends CommonRepository<User, Integer> {

    public UserRepository(EntityManagerFactory emf) {
        super(emf, User.class);
    }

    public List<User> findAllByIds(List<Integer> ids) {
        return super.query((em) -> {
            TypedQuery<User> q = em.createQuery("select p from Recette p where id in :ids", User.class);
            q.setParameter("ids", ids);
            return q.getResultList();
        });
    }
}