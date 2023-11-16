package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;
import java.util.Random;


public class RegistroMascotas<T extends Mascota> {

    private List<T> mascotas;

    public RegistroMascotas() {
        mascotas = new ArrayList<>();
    }

    public void agregarMascotas(T mascota) {
        this.mascotas.add(mascota);
        System.out.println("\n************** Agregar Mascotas **************");
        System.out.println("Se ha agregado al registro la mascota => " + mascota.toString());
    }

    public List<T> buscarMascotaNombre(String valor) {
        List<T> mascotasFiltradas = new ArrayList<T>();
        System.out.println("\n************** Buscar Mascotas por Nombre **************");
        mascotas.forEach(p -> {
            if (valor.equalsIgnoreCase(p.getNombre())) {
                mascotasFiltradas.add(p);
                System.out.println("Mascotas con el nombre " + valor + " => " + p.toString());
            }
        });
        return mascotasFiltradas;
    }

    public List<T> buscarMascotaEspecie(String valor) {
        List<T> mascotasFiltradas = new ArrayList<T>();
        System.out.println("\n************** Buscar Mascotas por Especie **************");
        mascotas.forEach(p -> {
            if (valor.equalsIgnoreCase(p.getEspecie())) {
                mascotasFiltradas.add(p);
                System.out.println("Máscotas de la especie " + valor + " => " + p.toString());
            }
        });
        return mascotasFiltradas;
    }

    public Integer cantidadMascotas() {
        System.out.println("\n**************  Cantidad total de Mascotas **************");
        Integer cantidadMascotas = Math.toIntExact(mascotas.stream().count());
        return cantidadMascotas;
    }

    public Mascota<T> generarDatos() {
        System.out.println("\n**************  Generación de datos aleatorios **************");
        Mascota mascota = new Mascota();
        mascota.setId(Integer.valueOf(RandomStringUtils.randomNumeric(1, 4)));
        mascota.setNombre(RandomStringUtils.randomAlphabetic(20));
        mascota.setEdad(Integer.valueOf(RandomStringUtils.randomNumeric(1, 3)));
        mascota.setEspecie(RandomStringUtils.randomAlphabetic(10));
        System.out.println("Se ha generado la mascota: " + mascota.toString());

        return mascota;
    }
}
