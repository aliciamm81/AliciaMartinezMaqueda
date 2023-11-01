package org.example;
//******** Clase hija que hereda de Vestimenta ********
public class Pantalon extends Vestimenta{
    private String estilo;
    private String tipoTejido;

    //******* Constructor con atributos propios y de la clase padre ********
    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    //******* sobrescribo el método de la clase padre utilizando el método get heredado de la clase padre *******
    @Override
    public void mensaje() {
        System.out.println("Estos pantalones son de estilo: " + getEstilo());

    }

    //******* Métodos getter y setter *******
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }
}
