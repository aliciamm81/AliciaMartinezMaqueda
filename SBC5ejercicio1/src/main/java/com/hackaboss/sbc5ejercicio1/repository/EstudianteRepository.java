package com.hackaboss.sbc5ejercicio1.repository;

import com.hackaboss.sbc5ejercicio1.model.Estudiante;
import com.hackaboss.sbc5ejercicio1.model.Calificacion;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Repository
public class EstudianteRepository {

    List<Estudiante> estudianteList = Arrays.asList(new Estudiante(1L,123456L,"Juan","González", LocalDate.of(1988, 5, 5)),
            new Estudiante(2L, 789012L, "María", "López", LocalDate.of(1990, 8, 15)),
            new Estudiante(3L, 345678L, "Pedro", "Martínez", LocalDate.of(1992, 3, 25)),
            new Estudiante(4L, 901234L, "Ana", "Rodríguez", LocalDate.of(1985, 12, 10)),
            new Estudiante(5L, 567890L, "Carlos", "Pérez", LocalDate.of(1995, 6, 20)),
            new Estudiante(6L, 234567L, "Laura", "García", LocalDate.of(1997, 9, 5)));

    public List<Estudiante> obtenerEstudiantes(){
        return estudianteList;
    }




    List<Calificacion> calificacionList = Arrays.asList(
            new Calificacion(1L,7.0, 8.3,5.3, estudianteList.get(0),calcularPromedio(7.0,8.3,5.3)),
            new Calificacion(2L,6.0, 6.4,2.3, estudianteList.get(1),calcularPromedio(6.0,6.4,2.3)),
            new Calificacion(3L,8.0, 7.8,9.2, estudianteList.get(2),calcularPromedio(8.0,7.8,9.2)),
            new Calificacion(4L,3.0, 3.8,1.5, estudianteList.get(3),calcularPromedio(3.0,3.8,1.5)),
            new Calificacion(5L,8.0, 9.8,7.5, estudianteList.get(4),calcularPromedio(8.0,9.8,7.5))
         );

    public List<Calificacion> obtenerCalificaciones(){
        return this.calificacionList;
    }
    public Double calcularPromedio(Double num1,Double num2, Double num3) {
        Double suma = num1+num2+num3;
        return suma / 3;
    }
}
