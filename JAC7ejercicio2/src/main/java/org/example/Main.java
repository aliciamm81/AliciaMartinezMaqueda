package org.example;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tarea> listaTarea = Arrays.asList(new Tarea(11, "Toma de requisitos"),
                                               new Tarea(111, "Reunion con el cliente"),
                                               new Tarea(112, "Realizar informe"),
                                               new Tarea(21, "Elaboración de la documentación"),
                                               new Tarea(211, "Crear UML"),
                                               new Tarea(212, "Crear diagramas de flujo"),
                                               new Tarea(213, "Crear diagramas de entidad relacion"),
                                               new Tarea(31, "Desarrollar el código"),
                                               new Tarea(311, "Desarrollo backend"),
                                               new Tarea(312, "Desarrollar frontend"));

        Tarea tarea = new Tarea(1, "Diseño de la Aplicación");
        agregarTarea(listaTarea, tarea, 0);
        mostrarAgenda(tarea);

    }

    /**
     *
     * Método que, dada una lista de tareas, un objeto tarea y el valor inicial para la posición en la lista,
     * recorre la lista de manera recursiva. Incrementa el valor cada vez que se llama de nuevo.
     * Si la longitud del ID de la tarea es mayor o igual a 2, la agrega como una subtarea.
     * Finaliza la ejecución cuando el valor alcanza la longitud de la lista.
     * @param listaTarea
     * @param tarea
     * @param valor
     */
    public static void agregarTarea(List<Tarea> listaTarea, Tarea tarea, Integer valor) {

        if (valor == listaTarea.size()) {
            return;
        }
        Tarea nuevaTarea = listaTarea.get(valor);
        if(nuevaTarea.getId().toString().length() >= 2){
            tarea.agregarSubtarea(nuevaTarea);
        }
        agregarTarea(listaTarea, nuevaTarea, valor + 1);
    }

    /**
     * Método que muestra el contenido de la tarea pasada como parámetro. Para representar
     * las subsecciones, el tamaño del ID de la tarea determina el nivel de indentación.
     * Dependiendo de la longitud del ID, se representa una opción diferente.
     * @param tarea
     */
    public static void mostrarAgenda(Tarea tarea) {

        String guion = "";

        switch (tarea.getId().toString().length()) {
            case 1:
                guion = "|--Tarea principal: ";
                break;
            case 2:
                guion = "|----Subtarea: ";
                break;
            case 3:
                guion = "|------Sub-subtarea: ";
                break;
        }
        System.out.println(guion + tarea.getNombre());

        for (Tarea tarea1 : tarea.getSubtarea()) {
            mostrarAgenda(tarea1);
        }
    }

}