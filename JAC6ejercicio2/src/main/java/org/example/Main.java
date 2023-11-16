package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Creo los objetos de las máscotas de la clínica para registrar
         */
        Reptil reptil1 = new Reptil(1, "Pinki", 2,"lagarto");
        Ave ave1 = new Ave(2,"Pirrita",3,"Agaporni");
        Perro perro1 = new Perro(3,"Toby",5,"Tekel");
        Gato gato1 = new Gato(4,"Nieve",6,"Siames");

        /**
         * Creo la lista para guardar los registros y llamo al método que las va guardando
         * en la lista.
         */
        RegistroMascotas<Mascota> registroMascota = new RegistroMascotas<>();

        registroMascota.agregarMascotas(reptil1);
        registroMascota.agregarMascotas(ave1);
        registroMascota.agregarMascotas(perro1);
        registroMascota.agregarMascotas(gato1);

        /**
         * Guardo en una lista de tipo Mascotas todas las mascotas que me devuelva el método
         * que busca las mascotas que coincidan con el nombre pasado por parámetro.
         */
        registroMascota.buscarMascotaNombre("Pinki");
        registroMascota.buscarMascotaEspecie("lagarto");

        Mascota<Mascota> mascotaAleatoria = registroMascota.generarDatos();
        registroMascota.agregarMascotas(mascotaAleatoria);

        Integer numMascotas = registroMascota.cantidadMascotas();
        System.out.println("Número de mascotas: " + numMascotas);
        
        

    }
}