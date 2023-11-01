/*"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".
 */
package org.example;
public class Reptil extends Animal {

    private int longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    //****** Constructor con los atributos de la clase padre y los propios *******
    public Reptil(int id, String nombre, int edad, String pelaje, String alimentacion, int longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, pelaje, alimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    //******* Métodos getter y setter *******
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
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
        System.out.println("Hola, soy un reptil");
    }
}
