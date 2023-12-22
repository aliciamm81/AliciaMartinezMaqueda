package com.hackaboss.sbc5ejercicio1.controller;

import com.hackaboss.sbc5ejercicio1.dto.EstudianteDTO;
import com.hackaboss.sbc5ejercicio1.model.Calificacion;
import com.hackaboss.sbc5ejercicio1.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    EstudianteService estudianteSv;

    @GetMapping("/{numMatricula}")
    public Calificacion obtenerCalificacion(@PathVariable Long numMatricula){
        return estudianteSv.obtenerCalificacion(numMatricula);
    }
    @GetMapping("/ordendesc")
    public List<EstudianteDTO> obtenerCalifDesc(){
     return estudianteSv.obtenerCalifDesc();
    }
}
