package com.hackaboss.sbc3ejercicio1.controller;

import com.hackaboss.sbc3ejercicio1.model.Evento;
import com.hackaboss.sbc3ejercicio1.model.Participante;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/evento")
public class EventoController {
    List<Evento> eventos = new ArrayList<>();
    int ultimoId = (int) eventos.stream().map(p-> p.getParticipantes()).count();

    @PostMapping
    public String crear(@RequestBody Evento evento){
        evento.setId((long) (eventos.size()+1));
        eventos.add(evento);
        eventos.forEach(p-> p.getParticipantes().forEach(i-> {
            if(i.getId() == null){
                ultimoId+=1;
             i.setId((long) (ultimoId));
         }
        }));
        return "Envento creado";
    }

    @GetMapping
    public List<Evento> obtener(){
        return eventos;
    }

    @GetMapping("/{id}")
    public Evento obtenerPorId(@PathVariable Long id) {

        return eventos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);

    }
}
