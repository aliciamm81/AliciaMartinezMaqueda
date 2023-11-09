package org.example;

public class Agente implements Runnable{
    private String nombre;

    public Agente(String nombre) {
        this.nombre = nombre;
    }

    public synchronized void atenderLlamada(){
        System.out.println("El agente: " + this.nombre + " Esta atendiendo una llamada de teléfono");
    }

    public synchronized void resolverConsulta(){
        System.out.println("El agente: " + this.nombre + " Esta resolviendo una consulta");
    }

    public synchronized void registrarInformacionLlamada(){
        System.out.println("El agente: " + this.nombre + " Esta registrando la información de una llamada");
    }


    @Override
    public void run() {
          atenderLlamada();
          resolverConsulta();
          registrarInformacionLlamada();
    }
}
