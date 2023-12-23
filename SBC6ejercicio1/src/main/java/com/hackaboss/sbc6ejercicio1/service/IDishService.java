package com.hackaboss.sbc6ejercicio1.service;

import com.hackaboss.sbc6ejercicio1.dto.DishDTO;
import com.hackaboss.sbc6ejercicio1.model.Dish;
import com.hackaboss.sbc6ejercicio1.model.Ingredient;

import java.util.List;

public interface IDishService {
    public DishDTO findDishDTO(String name);

}
