package com.portfolio.galindez.service;

import com.portfolio.galindez.model.Persona;
import com.portfolio.galindez.model.Proyectos;
import com.portfolio.galindez.repository.PersonaRepository;
import com.portfolio.galindez.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectosServiceImplements implements ProyectosService{

    @Autowired
    private ProyectosRepository proyectosRepository;

    @Override
    public Proyectos crearProyecto(Proyectos proyectos){
        return proyectosRepository.save(proyectos);
    }


    @Override
    public List<Proyectos> verProyectos(){
        return (List<Proyectos>) proyectosRepository.findAll();
    }

    @Override
    public Proyectos verProyecto(long id) {
        return proyectosRepository.findById(id).get();
    }

    @Override
    public Proyectos modificarProyecto(long id, Proyectos proyectos){
        Proyectos proyectos1 =  proyectosRepository.findById(id).get();
        proyectos1.setImagen(proyectos.getImagen());
        proyectos1.setTitulo(proyectos.getTitulo());
        proyectos1.setDescripcion(proyectos.getDescripcion());
        proyectos1.setLink(proyectos.getLink());
        return proyectosRepository.save(proyectos1);
    }

    @Override
    public void eliminarProyecto(long id){
        proyectosRepository.deleteById(id);
    }
}
