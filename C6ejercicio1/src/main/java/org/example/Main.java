package org.example;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {


    public static void main(String[] args) {

      List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Camioneta(101,"PQR-111","Nissan","Frontier",2018,22000,75,10.5));
        listaVehiculos.add(new Moto(201,"MOT-001","Honda","CBR 600RR",2021,9000.00,599,"4 cilindros"));
        listaVehiculos.add(new Auto(301,"ELE-001","Tesla","Model 3",2022,45000.00,75,350));

        /*calculo de la antigüedad
        y la recarga de energía o combustible según corresponda*/
        for (int i = 0; i < listaVehiculos.size(); i++) {

            Vehiculo vehiculo = listaVehiculos.get(i);

            if(vehiculo instanceof Auto){

                System.out.println("\n *********** AUTOMOVIL ************: \n" + vehiculo.toString() + "\n" + "Antiguedad => " + vehiculo.calcularAntiguedad() + " años");
                ((Auto)vehiculo).cargarEnergia();

            } else if (vehiculo instanceof Moto){

                System.out.println("\n *********** MOTOCICLETA ************: \n" + vehiculo.toString() + "\n" + "Antiguedad =>: " + vehiculo.calcularAntiguedad() + " años");
                ((Moto)vehiculo).recargarCombustible();

            } else if(vehiculo instanceof Camioneta){

                System.out.println("\n *********** CAMIONETA ************: \n" + vehiculo.toString() + "\n" + "Antiguedad =>: " + vehiculo.calcularAntiguedad() + " años");
                ((Camioneta)vehiculo).recargarCombustible();
            }
        }


    }
}