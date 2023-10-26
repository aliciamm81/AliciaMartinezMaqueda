package org.example;

public class Electrodomestico {
    // Creo los atributos
    private Integer cod;
    private String marca;
    private String modelo;
    private Double consumo;
    private String color;

    //Constructor sin parámetros
    public Electrodomestico() {
    }

    //Constructor con parámetros.
    public Electrodomestico(Integer cod, String marca, String modelo , Double consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    //Getter y Setter
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() { return modelo;  }

    public void setModelo(String modelo) { this.modelo = modelo;  }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
