package com.hackaboss.sbc6ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dish {
    private Long id;
    private String nombre;
    private Double precio;
    private Long[] ingredientes;

}
