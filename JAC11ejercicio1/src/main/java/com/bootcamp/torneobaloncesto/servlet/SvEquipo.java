/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.bootcamp.torneobaloncesto.servlet;

import com.bootcamp.torneobaloncesto.logic.Equipo;
import com.bootcamp.torneobaloncesto.persistence.ControllerPersistence;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "SvEquipo", urlPatterns = {"/SvEquipo"})
public class SvEquipo extends HttpServlet {

    /**
     * Controlador de persistencia
     */
    ControllerPersistence control = new ControllerPersistence();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvEquipo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvEquipo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Maneja las peticiones HTTP GET para mostrar los equipos almacenados en la
     * base de datos. Se invoca al método del controlador para obtener todos los
     * registros de la tabla "equipo", los cuales se almacenan en un ArrayList y
     * se envían a la vista para su visualización.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Equipo> listaEquipos = control.findEquipos();
        request.setAttribute("resultados", listaEquipos);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    /**
     * Maneja las peticiones HTTP POST para crear un nuevo equipo. Crea un
     * objeto Equipo con el valor introducido por el usuario y utiliza el
     * controlador para insertar este nuevo registro en la base de datos.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombreEquipo");
        control.createEquipo(new Equipo(nombre));
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
