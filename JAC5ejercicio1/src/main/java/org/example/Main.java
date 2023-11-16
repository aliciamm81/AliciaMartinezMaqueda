package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = Arrays.asList(new Empleado("Juan", 20000.0, "Desarrollador"),
                                                 new Empleado("Ana", 50000.0, "Analista"),
                                                 new Empleado("Carlos", 20000.0, "Desarrollador"),
                                                 new Empleado("María", 50000.0, "Analista"),
                                                 new Empleado("Luisa", 80000.0, "Gerente"),
                                                 new Empleado("Pedro", 30000.0, "Desarrollador"));

        Double valor = 40000.0;

        empleados.stream()
                .filter(p -> p.getSalario() > valor)
                .collect(Collectors.toList())
                .forEach(p -> System.out.println("Empleado con salario superior a " + valor + " => " + p.toString()));

        System.out.println("\n*****************************************************************\n");


        Double promedioSalariosDesarrolladores = empleados.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("desarrollador"))
                .mapToDouble(p -> p.getSalario())
                .average()
                .orElse(0.00);
        System.out.println("El promedio del salario de los desarrolladores es => " + promedioSalariosDesarrolladores);
        Double promedioSalariosGerentes = empleados.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("gerente"))
                .mapToDouble(p -> p.getSalario())
                .average()
                .orElse(0.00);
        System.out.println("El promedio del salario de los gerentes es => " + promedioSalariosGerentes);
        Double promedioSalariosAnalistas = empleados.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("analista"))
                .mapToDouble(p -> p.getSalario())
                .average()
                .orElse(0.00);
        System.out.println("El promedio del salario de los analistas es => " + promedioSalariosAnalistas);


        System.out.println("\n*****************************************************************\n");


        empleados.stream()
                .sorted(Collections.reverseOrder(Comparator.comparingDouble(p -> p.getSalario())))
                .findFirst()
                .ifPresent(value -> System.out.println("Empleado con el salario más elevado => " + value.toString()));


    }

}