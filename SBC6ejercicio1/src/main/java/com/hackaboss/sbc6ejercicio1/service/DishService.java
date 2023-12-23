package com.hackaboss.sbc6ejercicio1.service;

import com.hackaboss.sbc6ejercicio1.dto.DishDTO;
import com.hackaboss.sbc6ejercicio1.model.Dish;
import com.hackaboss.sbc6ejercicio1.model.Ingredient;
import com.hackaboss.sbc6ejercicio1.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishService implements IDishService {

    @Autowired
    DishRepository dishRepository;


    @Override
    public DishDTO findDishDTO(String name) {
        DishDTO dishDTO = new DishDTO();
        dishDTO.setId(findDish(name).getId());
        dishDTO.setNombre(name);
        dishDTO.setIngredientes(findIngredients(name));
        dishDTO.setCaloriaMax(findMaxCaloriesDish(name));
        dishDTO.setCaloriasTotales(findAllCaloriesDish(name));

        return dishDTO;
    }

    private List<Ingredient> findIngredients(String name) {

        Long[] ingredients = dishRepository.loadDataBaseDish()
                .stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(name))
                .map(p -> p.getIngredientes()).findFirst().orElse(null);

        List<Ingredient> ingredientList = new ArrayList<>();
        dishRepository.loadDataBaseIngedient().forEach(p -> {
            for (Long i : ingredients) {
                if (i.equals(p.getId())) {
                    ingredientList.add(p);
                }
            }
        });
        return ingredientList;

    }

    private Dish findDish(String name){
        return dishRepository.loadDataBaseDish().stream()
                .filter( p-> p.getNombre().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    private Double findMaxCaloriesDish(String name) {
        Double caloriaMax = findIngredients(name).stream()
                .mapToDouble(Ingredient::getCalories)
                .max().orElse(0);

        return caloriaMax;
    }

    private Double findAllCaloriesDish(String name) {
        return findIngredients(name)
                .stream()
                .mapToDouble(Ingredient::getCalories)
                .reduce(0.0, Double::sum);
    }
}
