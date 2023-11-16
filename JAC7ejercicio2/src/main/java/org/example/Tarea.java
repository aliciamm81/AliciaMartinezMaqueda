package org.example;
import java.util.ArrayList;
import java.util.List;

public class Tarea {

    private Integer id;
    private String nombre;
    private List<Tarea> subtarea;

    public Tarea() {
    }

    public Tarea(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.subtarea = new ArrayList<>();

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

    public List<Tarea> getSubtarea() {
        return subtarea;
    }

    public void setSubtarea(List<Tarea> subtarea) {
        this.subtarea = subtarea;
    }


    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", subtarea=" + subtarea +
                '}';
    }
    /**
     * Método agregar Subtareas en una lista
     *
     * @param tarea
     */
    public void agregarSubtarea(Tarea tarea) {
        subtarea.add(tarea);
    }




}
