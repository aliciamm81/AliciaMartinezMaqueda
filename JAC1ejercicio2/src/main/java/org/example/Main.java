package org.example;

import java.util.*;

public class Main {
    static Integer id = 5;
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    static boolean noExiste;

    public static void main(String[] args) throws InventarioException {
        /**
         * Creo un lista de artículos para tener algo de datos en el inventario.
         */
        List<Inventario> listaInventario = new ArrayList<>();
        listaInventario.add(new Inventario(1, "lapiceros", 1.5, 8950));
        listaInventario.add(new Inventario(2, "grapadora", 12, 100));
        listaInventario.add(new Inventario(3, "boligrafo", 0.5, 10000));
        listaInventario.add(new Inventario(4, "cuandernos", 5, 5000));
        listaInventario.add(new Inventario(5, "carpetas", 3, 250));
        /**
         * Llamo al método iniciar que muestra al usuario por pantalla las opciones del menu
         * y le solicta al usuario que marque una opción
         */
        Integer opcion = 0;
        do {
            opcion = iniciar();
            switch (opcion) {
                case 1:
                    crear(listaInventario);
                    break;
                case 2:
                    editar(listaInventario);
                    break;
                case 3:
                    eliminar(listaInventario);
                    break;
                case 4:
                    listar(listaInventario);
                    break;
                case 5:
                    System.out.println("******* HASTA PRONTO *******");
                    break;
                default:
                    System.out.println("Selecciona una opción correcta");
                    break;
            }
        } while (opcion != 5);
    }


    /**
     * Método que muestra al usuario el menú con las opciones y le solicta que ingrese una opción. Devuelve la opción
     * marcada por el usuario.
     *
     * @return opcion
     */
    public static Integer iniciar() {
        System.out.println("************* INVENTARIO *************");
        System.out.println("Selecciona una de las siguiente opciones: ");
        System.out.println("1 - Crear nuevos productos");
        System.out.println("2 - Editar datos de un producto");
        System.out.println("3 - Borrar un producto");
        System.out.println("4 - Listar productos inventario");
        System.out.println("5 - Salir");
        try {
            Integer opcion = sc.nextInt();
            sc.nextLine();
            return opcion;
        } catch (InputMismatchException e) {
            System.out.println("Se ha introducido un tipo de dato no válido, solo se admiten tipos numéricos");
            return 5;
        }
    }

    /**
     * Método que dado un arraylist lo recorre buscando el id que el usario a introducido por pantalla, cuando lo
     * encuentra solicita los nuevos valores por pantalla y los va seteando.
     *
     * @param listaInventario
     */
    public static void editar(List<Inventario> listaInventario) throws InventarioException {
        try {
            noExiste = true;
            System.out.println("Introduce el id del artículo que quiere modificar");
            Integer id = sc.nextInt();
            sc.nextLine();
            for (Inventario inventario : listaInventario) {
                if (inventario.getId() == id) {
                    noExiste = false;
                    System.out.println("Introduce el nombre del producto");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce el precio del producto");
                    double precio = sc.nextDouble();
                    System.out.println("Introduce el stock");
                    Integer stock = sc.nextInt();

                    inventario.setNombre(nombre);
                    inventario.setPrecio(precio);
                    inventario.setStock(stock);
                    noExiste = false;
                    break;
                }
            }
            if (noExiste == true) {
                System.out.println("El Id seleccionado no existe");
            } else {
                System.out.println("Artículo modificado correctamente");
            }
        } catch (InputMismatchException e) {
            System.out.println("Se ha introducido un tipo de dato no válido, solo se admiten tipos numéricos");
            sc.nextLine();
        } catch (InventarioException e) {
            System.out.println("Se ha producido el siguiente error: " + e.getMessage());
        }
    }

    /**
     * Método que dado una lista de Inventario solicita los valores de los atributos y crea un objeto con estos valores,
     * si son datos válidos los añade el la lista de Inventario.
     *
     * @param listaInventario
     */
    public static void crear(List<Inventario> listaInventario) throws InventarioException {
        String centinela = "+";
        do {
            try {
                id++;
                System.out.println("Introduce el nombre del producto");
                String nombre = sc.nextLine();
                System.out.println("Introduce el precio del producto");
                double precio = sc.nextDouble();
                System.out.println("Introduce el stock");
                Integer stock = sc.nextInt();
                sc.nextLine();
                Inventario inventario = new Inventario(id, nombre, precio, stock);
                listaInventario.add(inventario);
                System.out.println("Artículo añadido correctamente");
                System.out.println("Si desea añadir más productos dale a la tecla \"+\" | Para salir pulsa cualquier tecla");
                centinela = sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Se ha introducido un tipo de dato no válido, solo se admiten tipos numéricos");
                break;
            } catch (InventarioException e) {
                System.out.println("Se ha producido el siguiente error: " + e.getMessage());
                break;
            }

        } while (centinela.equals("+"));
    }

    /**
     * Método que dato un arraylist, solicita al usuario un id y elimina el artículo del inventario.
     *
     * @param listaInventario
     */
    public static void eliminar(List<Inventario> listaInventario) throws InventarioException {
        try {
            System.out.println("Introduce el id del artículo que quiere eliminar");
            Integer id = sc.nextInt();
            sc.nextLine();
            noExiste = true;
            for (int i = 0; i < listaInventario.size(); i++) {
                if (listaInventario.get(i).getId() == id) {
                    listaInventario.remove(i);
                    System.out.println("Artículo eliminado correctamente");
                    noExiste = false;
                }
            }
            if (noExiste == true) {
                System.out.println("El Id seleccionado no existe");
            }
        } catch (InputMismatchException e) {
            System.out.println("Se ha introducido un tipo de dato no válido, solo se admiten tipos numéricos");
        }
    }

    /**
     * Método que dado una arraylist imprime por pantalla su contenido.
     *
     * @param listarinventario
     */
    public static void listar(List<Inventario> listarinventario) {
        for (Inventario inventario : listarinventario) {
            System.out.println(inventario.toString());
        }
    }

}