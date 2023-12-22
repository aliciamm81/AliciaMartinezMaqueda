package com.hackaboss.sbc5ejercicio1.service;

import com.hackaboss.sbc5ejercicio1.dto.EstudianteDTO;
import com.hackaboss.sbc5ejercicio1.model.Estudiante;
import com.hackaboss.sbc5ejercicio1.model.Calificacion;

import java.util.List;

public interface IEstudianteService {
    public List<Estudiante> obtenerEstudiantes();
    public Calificacion obtenerCalificacion(Long numMatricula);
    public List<EstudianteDTO> obtenerCalifDesc();
}
