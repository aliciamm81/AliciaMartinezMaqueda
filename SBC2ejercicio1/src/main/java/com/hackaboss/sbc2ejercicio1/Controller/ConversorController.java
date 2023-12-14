package com.hackaboss.sbc2ejercicio1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {
    @GetMapping("/conversor/{numero}")
    public Double convertirMetros(@PathVariable Double numero){

        return numero/100;
    }
}
