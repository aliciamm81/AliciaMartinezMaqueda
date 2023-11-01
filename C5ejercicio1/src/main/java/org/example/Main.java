package org.example;

public class Main {
    public static void main(String[] args) {

    //**** Creo los objetos y los almaceno en una variable ****

        Mamifero mamifero1 = new Mamifero(1,
                                          "Leon",
                                          50,
                                          "corto",
                                          "carnívoro",
                                          4,
                                          "vivípara",
                                          "leonado",
                                          "áreas semiáridas desérticas");

        Ave ave1 = new Ave(2,
                           "agaporni",
                           20,
                           "plumas",
                           "herbivoro",
                           16,
                           "verde y azul",
                           "cónico y fuerte",
                           "raso");

        Reptil reptil1 = new Reptil(3,
                                    "lagarto Gecko",
                                    20,
                                    "escamas",
                                    "insectos",
                                    15,
                                    "lisas y rugosas",
                                    "no son venenosos",
                                    "tropicales y desérticos");

        // Llamo al método saludar de cada objeto que mostrará un mensaje por pantalla
        // diferente dependiendo del objeto

        mamifero1.saludar();
        ave1.saludar();
        reptil1.saludar();

        // d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado…
        // ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?

        // Se puede hacer, solo que crea un objeto de tipo animal con las propiedades
        // que tiene animal por lo que no contiene las propiedades propias del mamífero
        // (número de patas, tipo de reproducción, color de pelaje, hábitat) sin embargo
        // el método saludar se comporta como el que contiene mamífero.

        System.out.println("\nProbando resultado del objeto de tipo Animal con la asignación de mamifero1");
        Animal animal1 = mamifero1;
        animal1.getAlimentacion();
        animal1.saludar();

        // E) Cambiar el modificador de acceso de los métodos de "public" a "private".
        // Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?
        // No se podría acceder ya que al ser private solo se pueden acceder desde su clase y no desde fuera.
        // al probarlo se obtiene este error "'saludar()' has private access in 'org.example.Mamifero'"

    }


}