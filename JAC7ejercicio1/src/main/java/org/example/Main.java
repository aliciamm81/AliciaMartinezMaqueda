package org.example;

public class Main {
    public static void main(String[] args) {

        /**
         * Directorio Principal
         */
        Directorio directorioPrincipal = new Directorio(1,"Principal");
        /**
         * Subdirectorios y archivos Nivel 1
         */
        Directorio subdirectorio11 = new Directorio(11,"Subdirectorio 1.1");
        subdirectorio11.agregarArchivo("Archivo1 en Nivel 1.1");
        Directorio subdirectorio12 = new Directorio(12,"Subdirectorio 1.2");
        subdirectorio12.agregarArchivo("Archivo1 en nivel 1.2");
        subdirectorio12.agregarArchivo("Archivo2 en nivel 1.2");

        /**
         * Subdirectorios Nivel 2
         */
        Directorio subdirectorio21 = new Directorio(21,"Subdirectorio 2.1");
        subdirectorio21.agregarArchivo("Archivo1 en nivel 2.1");
        subdirectorio21.agregarArchivo("Archivo2 en nivel 2.1");
        subdirectorio21.agregarArchivo("Archivo3 en nivel 2.1");

        /**
         * Subdirectorios Nivel 3
         */
        Directorio subdirectorio31 = new Directorio(31,"Subdirectorio 3.1");
        subdirectorio31.agregarArchivo("Archivo1 en nivel 3.1");
        subdirectorio31.agregarArchivo("Archivo2 en nivel 3.1");

        /**
         * Agrego directorios
         */
        subdirectorio21.agregarSubdirectorio(subdirectorio31);
        subdirectorio11.agregarSubdirectorio(subdirectorio21);
        directorioPrincipal.agregarSubdirectorio(subdirectorio11);
        directorioPrincipal.agregarSubdirectorio(subdirectorio12);


        /**
         * Explorador de directorio
         */
        ExploradorDirectorios explorador = new ExploradorDirectorios(1,"explorador1");

        explorador.explorarDirectorio(directorioPrincipal);
    }
}