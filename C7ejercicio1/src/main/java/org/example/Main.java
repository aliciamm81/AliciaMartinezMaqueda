package org.example;
import java.sql.Connection;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Conexión con la base de datos

        String url = "jdbc:mysql://localhost:3306/universidad";
        Connection c = DriverManager.getConnection(url,"root","123456");
        System.out.println("Conexión con la BD establecida");

        //Agregar nuevos estudiantes

        List<Estudiante> listaEstudiantes = new ArrayList<>();

        listaEstudiantes.add(new Estudiante(1,"Juan",25,8)) ;
        listaEstudiantes.add(new Estudiante(2,"Sonia",44,10)) ;
        listaEstudiantes.add(new Estudiante(3,"Alicia",50,7)) ;



        // Agrego los nuevos estudiantes a la base de datos
        String insertSql = "INSERT INTO estudiante (id,nombre,edad,calificacion) VALUES (?,?,?,?)";
        PreparedStatement pstatement = c.prepareStatement(insertSql);

        for (Estudiante estudiante:listaEstudiantes) {
            pstatement.setInt(1,estudiante.getId());
            pstatement.setString(2,estudiante.getNombre());
            pstatement.setInt(3,estudiante.getEdad());
            pstatement.setDouble(4,estudiante.getCalificacion());
            pstatement.execute();
        }

        //Mostrar la lista de estudiantes
        String sql = "SELECT * FROM estudiante";
        Statement statement = c.createStatement();
        ResultSet resultado = statement.executeQuery(sql);

        while(resultado.next()){
            System.out.println("ID: " + resultado.getInt(1) + " Nombre: " + resultado.getString(2) + " Edad: " + resultado.getInt(3) + " Calificación: " +  resultado.getInt(4));
        }




    }
}