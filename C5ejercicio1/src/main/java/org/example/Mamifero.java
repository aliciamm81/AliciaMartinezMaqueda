package org.example;
//***** Clase hija que hereda de Animal *****
public class Mamifero extends Animal{
    private int numPatas;
    private String reproduccion;
    private String colorPelaje;
    private String habitat;

    //****** Constructor con los atributos de la clase padre y los propios *******
    public Mamifero(int id, String nombre, int edad, String pelaje, String alimentacion, int numPatas, String reproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, pelaje, alimentacion);
        this.numPatas = numPatas;
        this.reproduccion = reproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    //******* Métodos getter y setter *******
    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    //****** Sobrescribo el método de la clase padre con otro mensaje ******
    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamífero");
    }

}
