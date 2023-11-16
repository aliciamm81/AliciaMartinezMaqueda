package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends Auto> {

    private List<T> autos;


    public Inventario() {
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(T auto) {
        autos.add(auto);
        System.out.println("Se ha agregado al inventario el modelo de auto => " + auto.getModelo());
    }

    public List<T> buscarAutosMarca(String marca) {
        List<T> resultados = new ArrayList<T>();
        autos.forEach((p) -> {
            if (marca.equals(p.getMarca())) {
                resultados.add(p);
                System.out.println(p.toString());
            }
        });
        return resultados;
    }

    public List<T> buscarAutosAno(Integer ano) {
        List<T> resultados = new ArrayList<T>();
        autos.forEach((p) -> {
            if (ano.equals(p.getAno())) {
                resultados.add(p);
                System.out.println(p.toString());
            }
        });
        return resultados;
    }


    public Double valorTotalInventario() {

        Double valorTotal = autos.stream().mapToDouble(p -> p.getPrecio()).sum();
        System.out.println("El valor total del inventario es: " + valorTotal);
        return valorTotal;

    }
}
