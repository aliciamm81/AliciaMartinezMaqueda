package com.hackaboss.sbc5ejercicio1.service;

import com.hackaboss.sbc5ejercicio1.dto.EstudianteDTO;
import com.hackaboss.sbc5ejercicio1.model.Estudiante;
import com.hackaboss.sbc5ejercicio1.model.Calificacion;
import com.hackaboss.sbc5ejercicio1.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class EstudianteService implements IEstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> obtenerEstudiantes() {

        return estudianteRepository.obtenerEstudiantes();
    }

    @Override
    public Calificacion obtenerCalificacion(Long numMatricula) {

        return this.estudianteRepository.obtenerCalificaciones()
                .stream()
                .filter(p -> p.getEstudiante().getNumMatricula().equals(numMatricula))
                .findFirst()
                .orElse(null);

    }

    @Override
    public List<EstudianteDTO> obtenerCalifDesc() {

        List<Calificacion> calificaciones = estudianteRepository.obtenerCalificaciones();
        List<EstudianteDTO> estudianteDTOList = new ArrayList<>();
        calificaciones.forEach(p -> {
            EstudianteDTO alumno = new EstudianteDTO();
            alumno.setNombreEstudiante(p.getEstudiante() != null ? p.getEstudiante().getNombre() : "");
            alumno.setNumMatricula(p.getEstudiante() != null ? p.getEstudiante().getNumMatricula() : 0L);
            alumno.setPromedio(p.getPromedio());
            estudianteDTOList.add(alumno);

        });
        return estudianteDTOList.stream().sorted(Comparator.comparing(EstudianteDTO::getPromedio).reversed()).toList();

    }

}
