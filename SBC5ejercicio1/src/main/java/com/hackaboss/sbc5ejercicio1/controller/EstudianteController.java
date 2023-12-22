package com.hackaboss.sbc5ejercicio1.controller;

import com.hackaboss.sbc5ejercicio1.model.Estudiante;
import com.hackaboss.sbc5ejercicio1.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteSv;

    @GetMapping
    public List<Estudiante> obtenerEstudiantes(){

        return estudianteSv.obtenerEstudiantes();
    }


}
