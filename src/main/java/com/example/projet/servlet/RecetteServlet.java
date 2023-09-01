package com.example.projet.servlet;

import com.example.projet.entity.Recette;
import com.example.projet.repository.RecetteRepository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "RecetteServlet", value = "/recettelist")
public class RecetteServlet extends HttpServlet {
    private String message;
    public void init(){ message = "placeholder recettelist ";}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");

        RecetteRepository recetteRepo = new RecetteRepository(emf);
        EntityManager em = emf.createEntityManager();

        RecetteRepository recetteRepository = new RecetteRepository(emf);
        List<Recette> recettes = recetteRepository.findAll();
        request.setAttribute("recettes", recettes);
        request.getRequestDispatcher("/WEB-INF/recettelist.jsp").forward(request,response);
        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    public void destroy() {
    }
}