package com.hackaboss.sbc5ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Calificacion {

    private Long id;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Estudiante estudiante;
    private Double promedio;

}
