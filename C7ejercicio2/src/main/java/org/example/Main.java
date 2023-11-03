package org.example;

import org.example.logica.Platillo;
import org.example.persistencia.ControladoraPersistencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ControladoraPersistencia controladora = new ControladoraPersistencia();

        Platillo platillo1 = new Platillo(1,"espaguetis boloñesa","Deliciosos espaguetis con carne picada y tomate",15.25);


        // Crear un objeto mediante JPA
        controladora.crearPlatillo(platillo1);
        System.out.println("El objeto ha sido creado en la base de datos");

        //Creo dos objeto más
        Platillo platillo2 = new Platillo(2,"cocido","Garbanzos con jamon, zarahoria, puerro y morcillo",20.25);
        Platillo platillo3 = new Platillo(3,"ensalada mixta","Lechuga con tomate, cebolla y aceitunas",15.25);
        controladora.crearPlatillo(platillo2);
        controladora.crearPlatillo(platillo3);
        System.out.println("Los objetos han sido creados en la base de datos \n");

        //Eliminar de un objeto creado y persistido anteriormente
        controladora.eliminarPlatillo(2);

        //Editar el objeto platillo3 que ya existe en la base de datos
        platillo3.setNombre("Ensaladilla rusa");
        controladora.editarPlatillo(platillo3);


        //Se obtiene (listado) de los platos en la base de datos
        List<Platillo> listPlatillo = controladora.listarPlatillo();

        System.out.println("\nEl menú del hoy es: ");

        for (Platillo platillo : listPlatillo ) {
            System.out.println(platillo.getNombre());
        }

    }
}