package com.aliciamm.sbc1ejercicio1.controller;

import com.aliciamm.sbc1ejercicio1.model.Refran;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class RefranController {
    @GetMapping
    public Refran obtenerRefran() {
        List<Refran> refranes = Arrays.asList(new Refran(1, "El que mucho abarca poco aprieta"),
                new Refran(2, "No hay mal que por bien no venga"),
                new Refran(3, "No por mucho madrugar amanece más temprano"),
                new Refran(4, "Al mal tiempo buena cara"),
                new Refran(5, "Solo nos acordamos de Santa Bárbara cuando truena"),
                new Refran(6, "Cuando el grajo vuela bajo, hace un frío del carajo"),
                new Refran(7, "Hasta el cuarenta de mayo no te quites el sayo"),
                new Refran(8, "Quien tiene un tío en Alcalá, ni tiene tío ni tiene ná"),
                new Refran(9, "De tal palo, tal astilla"),
                new Refran(10, "A rey muerto, rey puesto"));
        int index = ThreadLocalRandom.current().nextInt(0, 10);
        return refranes.get(index);
    }
}
