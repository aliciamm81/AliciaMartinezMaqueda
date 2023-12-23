package com.hackaboss.sbc6ejercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {
    private Long id;
    private String name;
    private Integer calories;
}
