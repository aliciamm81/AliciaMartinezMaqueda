package org.example;

import java.util.ArrayList;
import java.util.List;

public class Directorio {

    private Integer id;
    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    // Constructor, métodos para agregar subdirectorios y archivos, etc.


    public Directorio(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return "Directorio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", subdirectorios=" + subdirectorios +
                ", archivos=" + archivos +
                '}';
    }

    /**
     * Método agregar subdirectorios en una lista
     * @param directorio
     */

    public void agregarSubdirectorio (Directorio directorio){
            subdirectorios.add(directorio);
    }

    /**
     * Método agregar archivos en una lista
     * @param directorio
     */
    public void agregarArchivo (String directorio){
            archivos.add(directorio);
    }

}
