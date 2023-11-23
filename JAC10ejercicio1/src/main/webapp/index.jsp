<%-- 
    Document   : index
    Created on : 22 nov 2023, 11:08:15
    Author     : Alicia
--%>

<%@page import="java.util.List"%>
<%@page import="com.grupoestudiantes.jac10ejercicio1.logic.Vote"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votacion</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    </head>
    <body>

        <div class="container mt-4 " style="width: 500px;">
            <h2>Votación</h2>
            <form class="m-4 w-200" action="SvVote" method="post">
                <p>Elije su voto:</p>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="A" name="vote" id="flexRadioDefault1"  >
                    <label class="form-check-label" for="flexRadioDefault1">
                        Partido A
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="B" name="vote" id="flexRadioDefault2" checked >
                    <label class="form-check-label" for="flexRadioDefault2">
                        Partido B
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" value="C" name="vote" id="flexRadioDefault2" >
                    <label class="form-check-label" for="flexRadioDefault2">
                        Partido C
                    </label>
                </div>
                <div class="mt-3"> 
                    <input type="submit" class="btn-check " id="votar" checked autocomplete="off">
                    <label class="btn btn-primary" for="votar">Votar</label>
                </div> 
            </form>
            
            
            <div class="results-table">
                <form class="m-4 w-200" action="SvVote" method="get">
                    <div class=" mt-3"> 
                        <input type="submit" class="btn-check " id="consultVote" checked autocomplete="off">
                        <label class="btn btn-success" for="consultVote">Consultar votaciones</label>
                    </div> 

                </form>
                <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre Partido</th>
                            <th>Cantidad Votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for (Vote vote : (List<Vote>) request.getAttribute("resultados")) {%>
                        <tr>
                            <td><%=vote.getName()%></td>
                            <td><%=vote.getVote()%></td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <% }%>
            </div>
        </div>
    </div>

</body>
</html>
