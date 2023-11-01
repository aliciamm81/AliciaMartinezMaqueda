package org.example;

/*"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
 */
public class Ave extends Animal{

    private double tamanoAlas;
    private String colorPlumas;
    private String tipoPico;
    private String tipoVuelo;

    //****** Constructor con los atributos de la clase padre y los propios *******

    public Ave(int id, String nombre, int edad, String pelaje, String alimentacion, double tamanoAlas, String colorPlumas, String tipoPico, String tipoVuelo) {
        super(id, nombre, edad, pelaje, alimentacion);
        this.tamanoAlas = tamanoAlas;
        this.colorPlumas = colorPlumas;
        this.tipoPico = tipoPico;
        this.tipoVuelo = tipoVuelo;
    }

    //******* Métodos getter y setter *******
    public double getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(double tamanoAlas) {
        this.tamanoAlas = tamanoAlas;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    //****** Sobrescribo el método de la clase padre con otro mensaje ******
    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave");
    }
}
