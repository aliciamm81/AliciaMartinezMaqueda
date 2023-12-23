package com.hackaboss.sbc6ejercicio1.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackaboss.sbc6ejercicio1.model.Dish;
import com.hackaboss.sbc6ejercicio1.model.Ingredient;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class DishRepository {

    public List<Ingredient> loadDataBaseIngedient() {
        File file = null;
        try {
            file = ResourceUtils.getFile("ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Ingredient>> typeRef = new TypeReference<>() {};
        List<Ingredient> ingredient= null;
        try {
            ingredient= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingredient;
    }
    public List<Dish> loadDataBaseDish() {
        File file = null;
        try {
            file = ResourceUtils.getFile("dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Dish>> typeRef = new TypeReference<>() {};
        List<Dish> dishList= null;
        try {
            dishList= objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dishList;
    }


}
