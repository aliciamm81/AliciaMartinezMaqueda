package org.example.persistencia;

import org.example.logica.Platillo;

import java.util.List;

public class ControladoraPersistencia {
    PlatilloJpaController platilloJpa = new PlatilloJpaController();

    public void crearPlatillo(Platillo platillo){
        platilloJpa.create(platillo);
    }

    public void eliminarPlatillo(Integer id){
        platilloJpa.destroy(id);
    }

    public void editarPlatillo(Platillo platillo){
        platilloJpa.edit(platillo);
    }

    public List<Platillo> listarPlatillo(){
        return platilloJpa.findPlatilloEntities();
    }
}

