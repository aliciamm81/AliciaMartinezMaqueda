package org.example;
//******** Clase hija que hereda de Vestimenta ********
public class Camiseta extends Vestimenta{
    private String manga;
    private String cuello;

    //******* Constructor con atributos propios y de la clase padre ********
    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }
    //******* sobrescribo el método de la clase padre utilizando el método get heredado de la clase padre *******
    @Override
    public void mensaje() {
        System.out.println("Esta camiseta es de manga: " + getManga());
    }

    //******* Métodos getter y setter *******
    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String tamano) {
        this.cuello = tamano;
    }
}
