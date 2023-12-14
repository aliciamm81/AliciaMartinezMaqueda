package com.hackaboss.sbc3ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Participante {

    private Long id;
    private String nombre;
    private String apellidos;
    private Integer telefono;
    private Integer dni;


}
