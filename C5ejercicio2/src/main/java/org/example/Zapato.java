package org.example;
//******** Clase hija que hereda de Vestimenta ********
public class Zapato extends Vestimenta {
    private String tipoCierre;
    private String material;

    //******* Constructor con atributos propios y de la clase padre ********
    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String tipoCierre, String material) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipoCierre = tipoCierre;
        this.material = material;
    }

    //******* sobrescribo el método de la clase padre utilizando el método get heredado de la clase padre *******
    @Override
    public void mensaje() {
        System.out.println("Estos zapatos son de marca: " + getMarca());
    }

    //******* Métodos getter y setter *******
    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
