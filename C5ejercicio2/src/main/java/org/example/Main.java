package org.example;

public class Main {
    public static void main(String[] args) {

        // Creo el array que contendrá todos los objetos
        Vestimenta[] vestimentas = new Vestimenta[9];

        // Almaceno en el array cada objeto que voy creando con sus parámetros.
        vestimentas[0] = new Zapato(12345,"Air max",35,"Nike","38","blanca","cordones","Malla y cuero sintético");
        vestimentas[1] = new Zapato(67890,"Zapato de vestir",130,"Clarks","37","Marrón","Hebilla","Cuero");
        vestimentas[2] = new Zapato(54321,"Sandalia veraniega",15,"Corcs","36","Azul","Volcro","Resina");
        vestimentas[3] = new Pantalon(25425,"Pantalón Vaquero",60,"Levis","L","Azul","Slim","Denim");
        vestimentas[4] = new Pantalon(64546,"Pantalón Cargo",25,"Columbia","XL","Verde Oliva","Regular Fit","Algodón");
        vestimentas[5] = new Pantalon(001254,"Pantalón Deportivo",32,"Nike","S","Gris","Joggers","Poliéster y Algodón");
        vestimentas[6] = new Camiseta(125465,"Camiseta Deportiva",25,"Adidas","M","Blanco","corta","ancho");
        vestimentas[7] = new Camiseta(128865,"Camiseta casual",24.99,"H&M","S","Negro","larga","Regular");
        vestimentas[8] = new Sombrero(355465,"Sombrero de paja",9.99,"H&M","S","Natural","Ala ancha","Ajustable");

        // Recorro el array y muestro un mensaje por pantalla invocando al método mensaje de cada objeto
        for (Vestimenta vestimenta: vestimentas) {
            vestimenta.mensaje();
        }
    }
}

