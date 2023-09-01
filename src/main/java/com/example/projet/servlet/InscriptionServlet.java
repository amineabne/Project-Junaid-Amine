package com.example.projet.servlet;

import com.example.projet.entity.User;

import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "inscriptionServlet", value = "/inscription")
public class InscriptionServlet extends HttpServlet {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        // Récupérer les données du formulaire
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        Part photoPart = request.getPart("photo");
        String motDePasse = request.getParameter("motdepasse");

        EntityManager em = emf.createEntityManager();

        try {
            // Vérification si l'utilisateur existe déjà
            TypedQuery<User> userQuery = em.createQuery("SELECT u FROM User u WHERE u.email = :email", User.class);
            userQuery.setParameter("email", email);
            User existingUser = userQuery.getSingleResult();

            // L'utilisateur existe déjà
            request.setAttribute("erreur", "Un utilisateur avec cette adresse email existe déjà.");
            request.getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
        } finally {
            em.close();
        }
    }






}
