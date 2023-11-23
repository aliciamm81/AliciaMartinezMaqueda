<%-- 
    Document   : index
    Created on : 22 nov 2023, 17:07:20
    Author     : Alicia
--%>

<%@page import="com.bootcamp.torneobaloncesto.logic.Partido"%>
<%@page import="java.util.List"%>
<%@page import="com.bootcamp.torneobaloncesto.logic.Equipo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    </head>
    <body>
        <div class="container mt-4" style="width: 500px">
            <h2>Crear equipo</h2>
            <form action="SvEquipo" method="post" accept-charset="UTF-8">
                <div class="form-group">
                    <label for="nombreEquipo">Ingresa un nombre</label>
                    <input type="text" class="form-control" id="nombreEquipo" name="nombreEquipo">
                </div>
                <button type="submit" class="btn btn-primary">Crear</button>
            </form>
        </div

        <br>
        <br>
        <div class="container mt-4" style="width: 500px">

            <div class="results-table mt-3">
                <form action="SvEquipo" method="get" accept-charset="UTF-8">

                    <button type="submit" class="btn btn-primary">Mostrar</button>
                </form>
                <% if (request.getAttribute("resultados") != null) { %>
                <h3 class="mt-3">Lista de los equipos</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Id Equipo</th>
                            <th>Nombre</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Equipo equipo : (List<Equipo>) request.getAttribute("resultados")) {%>
                        <tr>
                            <td><%= equipo.getId()%></td>
                            <td><%= equipo.getName()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>

        </div>

        <div class="container mt-4" style="width: 500px">
            <h2>Crear partidos</h2>
            <form action="SvPartido" method="post" accept-charset="UTF-8">
                <div class="form-group">
                    <label for="fechaPartido">Ingresa la fecha</label>
                    <input type="date" class="form-control" id="fechaPartido" name="fechaPartido">
                </div>
                <div class="form-group">
                    <label for="equipoVisitante">Ingresa el id del equipo visitante</label>
                    <input type="text" class="form-control" id="equipoVisitante" name="equipoVisitante">
                </div>
                <div class="form-group">
                    <label for="equipoLocal">Ingresa el id del equipo local</label>
                    <input type="text" class="form-control" id="equipoLocal" name="equipoLocal">
                </div>
                <div class="form-group">
                    <label for="resultadoLocal">Resultado equipo local</label>
                    <input type="text" class="form-control" id="resultadoLocal" name="resultadoLocal">
                </div>
                <div class="form-group">
                    <label for="resultadoVisitante">Resultado equipo visitante</label>
                    <input type="text" class="form-control" id="resultadoVisitante" name="resultadoVisitante">
                </div>
                <button type="submit" class="btn btn-primary">Crear</button>
            </form>
        </div>
        <br>
        <br>

        <div class="container mt-4" style="width: 500px">

            <div class="results-table mt-3">
                <form action="SvPartido" method="get" accept-charset="UTF-8">

                    <button type="submit" class="btn btn-primary">Mostrar</button>
                </form>
                <% if (request.getAttribute("resultados1") != null) { %>
                <h3 class="mt-3">Lista de los partidos</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Id Partido</th>
                            <th>Fecha</th>
                            <th>Equipo Local</th>
                            <th>Equipo Visitante</th>
                            <th>Resultado Local</th>
                            <th>Resultado Visitante</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Partido partido : (List<Partido>) request.getAttribute("resultados1")) {%>
                        <tr>
                            <td><%= partido.getId()%></td>
                            <td><%= partido.getFecha()%></td>
                            <td><%= partido.getEquipoLocal()%></td>
                            <td><%= partido.getEquipoVisitante()%></td>
                            <td><%= partido.getResultadoLocal()%></td>
                            <td><%= partido.getResultadoVisitante()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>

        </div>


        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
