package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Creo el arrayList  y guardo los objetos

        List<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto(1001, "Laptop HP Pavilion","HP","Ordenador Portátil",899.99,700,999.99,20));
        listaProductos.add(new Producto(2002, "Monitor Dell UltraSharp","Dell","Monitor de Ordenador",249.99,200,279.99,30));
        listaProductos.add(new Producto(3003, "Teclado Mecánico Logitech","Logitech","Teclado Mecánico Logitech",79.99,50,89.99,50));
        listaProductos.add(new Producto(9009, "Router Wifi ASUS","ASUS","Router Inalámbrico",99.99,75,109.99,40));
        listaProductos.add(new Producto(4004, "Disco Duro Externo Seagate","Seagate","Almacenamiento Externo",129.99,100,139.99,25));
        listaProductos.add(new Producto(5005, "Impresora Brother Laser","Brother","Impresora Brother Laser",199.99,160,219.99,15));
        listaProductos.add(new Producto(6006, "Software Antivirus McAfee","McAfee","Software Antivirus McAfee",49.99,30,59.99,100));
        listaProductos.add(new Producto(7007, "Auriculares Sony con Cancelación de Ruido","Sony","Auriculares Sony con Cancelación de Ruido",199.99,150,219.99,20));
        listaProductos.add(new Producto(8008, "Tableta Gráfica Wacom","Wacom","Tableta Digitalizadora",149.99,120,169.99,10));
        listaProductos.add(new Producto(1010, "Webcam Logitech Full HD","Logitech","Webcam",69.99,50,79.99,35));

        //Recorro el ArrayList para buscar cual es el precio menor y el mayor y almaceno cada uno en una variable.*/
        double precioMax = listaProductos.get(0).getPvp();
        double precioMin = listaProductos.get(0).getPvp();

        for (Producto producto: listaProductos) {
            if(producto.getPvp() > precioMax){
                precioMax = producto.getPvp();
            }
        }

        for (Producto producto: listaProductos) {
            if(producto.getPvp() < precioMin){
                precioMin = producto.getPvp();
            }
        }

        // Llamo a un método que muestra por pantalla el listado de los productos y muestro por pantalla los precios maximos y mínimos.
        stockActual(listaProductos);
        System.out.println("El precio de venta más alto es: " + precioMax);
        System.out.println("El precio de venta más bajo es: " + precioMin + "\n");


        // Llamo al método que muestra el listado tal como está antes de borrar un objeto
        System.out.println("****** Lista productos antes de borrar *******");
        stockActual(listaProductos);

        // Borro el objeto y muestro de nuevo el listado para ver como ha quedado
        listaProductos.remove(4);
        System.out.println("\n****** Lista productos después de borrar *******");
        stockActual(listaProductos);

        //Creo dos variable que almacenarán el stock mayor y la posición que tiene en el array
        int stock = listaProductos.get(0).getStock();
        int index = 0;

        //Recorro el array para buscar el objeto que tiene mayor stock
        for (int i = 0; i < listaProductos.size(); i++) {
            if(listaProductos.get(i).getStock() > stock){
                stock = listaProductos.get(i).getStock();
                index = i;

            }
        }

        // Muestro el producto de mayor stock  y el listado
        System.out.println("El producto de mayor stock es: " + listaProductos.get(index).getNombre() + " => " + listaProductos.get(index).getStock() + "\n");
        stockActual(listaProductos);

        // Le quito 3 und al stock mayor y muestro el listado de nuevo
        listaProductos.get(index).setStock(stock-=3);
        stockActual(listaProductos);



    }

    //Método que muestra por pantalla los nómbres y el stock de todos los productos de una lista de tipo Producto.
    public static void stockActual(List<Producto>listaProductos){
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(i + " => " + listaProductos.get(i).getNombre() + " | Stock: " + listaProductos.get(i).getStock() + " | PVP: " + listaProductos.get(i).getPvp());
        }
        System.out.println(" ");
    }
}