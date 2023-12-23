package com.hackaboss.sbc6ejercicio1.controller;

import com.hackaboss.sbc6ejercicio1.dto.DishDTO;
import com.hackaboss.sbc6ejercicio1.model.Ingredient;
import com.hackaboss.sbc6ejercicio1.service.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dishes")
public class DishController {

    @Autowired
    IDishService iDishService;


    @GetMapping("/{name}")
    public DishDTO findDish(@PathVariable String name){
        return iDishService.findDishDTO(name);
    }

}
