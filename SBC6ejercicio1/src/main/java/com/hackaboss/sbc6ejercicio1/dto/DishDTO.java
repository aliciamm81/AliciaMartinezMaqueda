package com.hackaboss.sbc6ejercicio1.dto;

import com.hackaboss.sbc6ejercicio1.model.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DishDTO {
    private Long id;
    private String nombre;
    private List<Ingredient> ingredientes;
    private Double caloriaMax;
    private Double caloriasTotales;
}
