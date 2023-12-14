package com.hackaboss.sbc2ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @GetMapping("/morse")
    public String obtenerMorse(@RequestParam String texto) {
        String textoMorse = convertirTextoAMorse(texto);
        return textoMorse;
    }


    private String convertirTextoAMorse(String texto){
        String[] alfabeto = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"," "
        };

        String[] codigoMorse = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.","/"
        };

        StringBuilder textoMorse = new StringBuilder();

        texto.chars().forEach(p -> {
            char caracter = (char) p;
            String c = String.valueOf(caracter);
            for (int i = 0; i < alfabeto.length; i++) {

                if(c.equalsIgnoreCase(alfabeto[i])) {
                    textoMorse.append(codigoMorse[i]);
                    textoMorse.append(" ");
                }
            }
        });


        return textoMorse.toString();

    }


}
