package org.example;

import java.util.List;

public class ExploradorDirectorios extends Directorio{

    public ExploradorDirectorios(Integer id, String nombre) {
        super(id, nombre);
    }

    /**
     * Método recursivo que pinta el contenido de un objeto dado por parámetro,
     * para que se aprecie en la forma de pintarse el nivel le he añadido unos guiones
     * que se pintan dependiendo del primer número que tenga el id.
     * @param directorio
     */
    public void explorarDirectorio(Directorio directorio){

        String guion = "";
        if(directorio.getId().toString().length()>1){
            switch (directorio.getId().toString().substring(0, 1)){
                case "1": guion="-";
                    break;
                case "2": guion="--";
                    break;
                case "3": guion="---";
                    break;
            }
        }
        System.out.println(guion + directorio.getId()  + " " + directorio.getNombre());
        for(String archivo : directorio.getArchivos()){
            System.out.println(guion + archivo);
        }
        for (Directorio directorio1: directorio.getSubdirectorios() ) {
             explorarDirectorio(directorio1);
        }

    }
}
