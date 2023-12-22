package com.hackaboss.sbc5ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDTO {

    private Long numMatricula;
    private String nombreEstudiante;
    private Double promedio;

}
