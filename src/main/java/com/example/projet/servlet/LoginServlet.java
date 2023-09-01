package com.example.projet.servlet;

import com.example.projet.entity.User;

import com.example.projet.Database;
import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "helloServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    EntityManagerFactory emf = Database.getInstanceEmf();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User userFound = null;
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<User> userQuery = em.createQuery("SELECT u FROM User u WHERE u.userName = :username", User.class);
            userQuery.setParameter("username", username);
            userFound = userQuery.getSingleResult();
            if (userFound != null && userFound.getPassword().equals(password)) {
                HttpSession session = req.getSession();
                session.setAttribute("username", username);
                resp.sendRedirect(req.getContextPath() + "/welcome");
            } else {
                req.setAttribute("error", "Bad credentials");
                req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);

            }
        } catch (NoResultException e) {
            req.setAttribute("error", "Bad credentials");
            req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);
        }
        em.close();

    }
}
