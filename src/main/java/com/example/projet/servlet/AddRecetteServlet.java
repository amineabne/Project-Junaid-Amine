//package com.example.projet.servlet;
//
//import com.example.projet.entity.Recette;
//import com.example.projet.repository.CommonRepository;
//import com.example.projet.repository.RecetteRepository;
//import jdk.jfr.internal.Repository;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "AddRecetteServlet", value = "/addrecette")
//public class AddRecetteServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/WEB-INF/add-game.jsp").forward(req, resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
//        String name = request.getParameter("name");
//        String description = request.getParameter("description");
//        Integer nombre = request.getIntHeader("nombre");
//
//
//
//    }
//}
