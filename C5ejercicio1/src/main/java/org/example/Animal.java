package org.example;

//******* Clase Padre ********
public class Animal {

    //**** Atributos de la clase padre ****
    private int id;
    private String nombre;
    private int edad;
    private String pelaje;
    private String alimentacion;


    //**** Constructor de la clase padre ****
    public Animal(int id, String nombre, int edad, String pelaje, String alimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.pelaje = pelaje;
        this.alimentacion = alimentacion;
    }



    //**** Métodos getter y setter ****


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }


    //**** Método que imprime por pantalla un mensaje ****
    public void saludar(){
        System.out.println("Hola soy un animal");
    }
}
