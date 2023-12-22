package com.hackaboss.sbc5ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Estudiante {

    private Long id;
    private Long numMatricula;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

}
