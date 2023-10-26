package org.example;

public class Main {
    public static void main(String[] args) {
        //a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        Persona[] personas = new Persona[5];
        personas[0] = new Persona(1,"Juan",25,"Calle barcelona nº 15",656225325);
        personas[1] = new Persona(1,"Sofia",20,"Calle las rosas nº 13",632245452);
        personas[2] = new Persona(1,"Vicky",41,"Calle las flores nº 8",632565656);
        personas[3] = new Persona(1,"Luisa",45,"Calle los arboles nº 9",624455555);
        personas[4] = new Persona(1,"Felipe",38,"Calle mariposas nº 125",666333221);


        //b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        for (Persona persona: personas) {
            System.out.println("Nombre: " + persona.getNombre() + " => Edad: " + persona.getEdad());
        }


        //c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes,
        // realizar el cambio y luego mostrar el después de los datos de las dos personas
        // cuyos nombres fueron cambiados.

        //Imprimo los nombres de las dos personas
        System.out.println("\nNombre persona 1: " + personas[0].getNombre() + " | Nombre persona 2: " + personas[1].getNombre());

        // Cambio los nombres de las dos personas e imprimo de nuevo
        personas[0].setNombre("Lola");
        personas[1].setNombre("Alicia");
        System.out.println("\nNuevo nombre persona 1: " + personas[0].getNombre() + " | Nuevo nombre persona 2: " + personas[1].getNombre() + "\n");


        //d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
        System.out.println("Mayores de 30 años: ");
        for (Persona persona: personas ) {

            if (persona.getEdad() > 30) {
                System.out.println("Nombre: "  + persona.getNombre() + " Edad: " + persona.getEdad());
            }
        }

    }
}