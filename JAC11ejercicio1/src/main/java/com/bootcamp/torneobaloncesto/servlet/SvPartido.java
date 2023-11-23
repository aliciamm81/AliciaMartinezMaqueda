/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.bootcamp.torneobaloncesto.servlet;

import com.bootcamp.torneobaloncesto.logic.Equipo;
import com.bootcamp.torneobaloncesto.logic.Partido;
import com.bootcamp.torneobaloncesto.persistence.ControllerPersistence;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
@WebServlet(name = "SvPartido", urlPatterns = {"/SvPartido"})
public class SvPartido extends HttpServlet {

    ControllerPersistence control = new ControllerPersistence();

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvPartido</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvPartido at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Maneja las peticiones HTTP GET para mostrar los partidos almacenados en
     * la base de datos. Se invoca al método del controlador para obtener todos
     * los registros de la tabla "partido", los cuales se almacenan en un
     * ArrayList y se envían a la vista para su visualización.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Partido> listaPartidos = control.findPartidos();
        request.setAttribute("resultados1", listaPartidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    /**
     * Maneja las peticiones HTTP POST para crear un nuevo registro de partido.
     * Recupera los valores ingresados por el usuario desde el formulario,
     * transformándolos al tipo de dato adecuado para crear un objeto Partido.
     * Luego, formatea los datos y los almacena en un objeto LocalDate. Busca
     * los equipos correspondientes a través de sus identificadores en la base
     * de datos. Finalmente, utiliza los datos recopilados para crear un objeto
     * Partido y lo almacena en la base de datos. Redirige hacia la página
     * "index.jsp" después de completar la operación.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            String fecha = request.getParameter("fechaPartido");
            Integer resultLocal = Integer.valueOf(request.getParameter("resultadoLocal"));
            Integer resultVisit = Integer.valueOf(request.getParameter("resultadoVisitante"));
            Integer idEquiLocal = Integer.valueOf(request.getParameter("equipoLocal"));
            Integer idEquiVisit = Integer.valueOf(request.getParameter("equipoVisitante"));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate fechaPartido = LocalDate.parse(fecha, formatter);

            Equipo equipoVisit = control.findEquipoId(idEquiVisit);
            Equipo equipoLocal = control.findEquipoId(idEquiLocal);

            Partido partido = new Partido(fechaPartido, resultLocal, resultVisit, equipoLocal, equipoVisit);

            control.createPartido(partido);
            response.sendRedirect("index.jsp");
        } catch (NumberFormatException e) {
            System.out.println("Introduce valores numéricos en los campos id y resultado");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
