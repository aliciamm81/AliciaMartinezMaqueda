package org.example;

public class Inventario {
    private Integer id;
    private String nombre;
    private double precio;
    private Integer stock;

    public Inventario(Integer id, String nombre, double precio, Integer stock) throws InventarioException {
        if (nombre.length() < 3) {
            throw new InventarioException("El nombre debe contemer al menos 3 carácteres");
        }
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws InventarioException {
        if (nombre.length() < 3) {
            throw new InventarioException("El nombre debe contener al menos 3 carácteres");
        } else {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Id = " + id +
                ",Nombre = '" + nombre + '\'' +
                ",Precio = " + precio +
                ",Stock = " + stock;
    }
}
