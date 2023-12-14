package com.aliciamm.sbc1ejercicio2.controller;

import com.aliciamm.sbc1ejercicio2.model.Dato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class DatoController {

    @GetMapping
    public Dato obtenerDatoCurioso() {
        List<Dato> datosCuriosos = Arrays.asList(new Dato(1, "Las cebras tienen rayas únicas, al igual que las huellas dactilares humanas."),
                new Dato(2, "En promedio, una persona pasa alrededor de seis meses de su vida esperando semáforos en rojo"),
                new Dato(3, "Las jirafas tienen el mismo número de huesos en el cuello que los humanos, a pesar de que sus cuellos pueden llegar a medir hasta 1.8 metros."),
                new Dato(4, "El corazón de un colibrí late alrededor de 1,260 veces por minuto."),
                new Dato(5, "El agujero en la capa de ozono es tan grande que podría contener hasta 3 millones de planetas del tamaño de la Tierra."),
                new Dato(6, "Los pulpos tienen tres corazones."),
                new Dato(7, "El alfabeto hawaiano tiene solo 12 letras."),
                new Dato(8, "El ojo de un avestruz es más grande que su cerebro."),
                new Dato(9, "Los pingüinos tienen glándulas especiales que les permiten beber agua salada."),
                new Dato(10, "Las hormigas nunca duermen."));
        int index = ThreadLocalRandom.current().nextInt(0, 10);
        return datosCuriosos.get(index);
    }
}
