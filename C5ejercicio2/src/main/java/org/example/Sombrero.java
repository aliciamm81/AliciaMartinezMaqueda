package org.example;
//******** Clase hija que hereda de Vestimenta ********
public class Sombrero extends Vestimenta{
    private String tipo;
    private String tamano;

    //******* Constructor con atributos propios y de la clase padre ********
    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamano) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamano = tamano;
    }
    //******* sobrescribo el método de la clase padre utilizando el método get heredado de la clase padre *******
    @Override
    public void mensaje() {
        System.out.println("Este sombrero es de tipo: " + getTipo());
    }

    //******* Métodos getter y setter *******

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}
