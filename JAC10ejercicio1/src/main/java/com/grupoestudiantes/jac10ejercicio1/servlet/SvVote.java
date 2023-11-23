/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.grupoestudiantes.jac10ejercicio1.servlet;

import com.grupoestudiantes.jac10ejercicio1.logic.Vote;
import com.grupoestudiantes.jac10ejercicio1.persistence.ControllerPersistence;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alicia
 */
@WebServlet(name = "SvVote", urlPatterns = {"/SvVote"})
public class SvVote extends HttpServlet {

    private ControllerPersistence control = new ControllerPersistence();

    private List<Vote> listVote = new ArrayList<>();

    private Integer valor = 0;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        for (Vote vote : this.listVote) {
            System.out.println("Get: " + vote.toString());
        }

        request.setAttribute("resultados", listVote);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String value = request.getParameter("vote");
        this.listVote = control.findVote();

        if (this.listVote.isEmpty()) {

            Vote vote1 = new Vote("A", 0);
            Vote vote2 = new Vote("B", 0);
            Vote vote3 = new Vote("C", 0);
            control.createVote(vote1);
            control.createVote(vote2);
            control.createVote(vote3);
        }

        switch (value) {
            case "A":
                List<Vote> filteredVotesA = listVote.stream().filter(p -> p.getName().equalsIgnoreCase("A")).toList();
                Vote voteA = filteredVotesA.get(0);
                valor = voteA.getVote();
                voteA.setVote(valor += 1);
                control.updateVote(voteA);
                break;
            case "B":
                List<Vote> filteredVotesB = listVote.stream().filter(p -> p.getName().equalsIgnoreCase("B")).toList();
                Vote voteB = filteredVotesB.get(0);
                valor = voteB.getVote();
                voteB.setVote(valor += 1);
                control.updateVote(voteB);
                break;
            case "C":
                List<Vote> filteredVotesC = listVote.stream().filter(p -> p.getName().equalsIgnoreCase("C")).toList();
                Vote voteC = filteredVotesC.get(0);
                valor = voteC.getVote();
                voteC.setVote(valor += 1);
                control.updateVote(voteC);
                break;

        }

        for (Vote vote : this.listVote) {
            System.out.println(vote.toString());
        }

        System.out.println("Valor: " + value);
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
