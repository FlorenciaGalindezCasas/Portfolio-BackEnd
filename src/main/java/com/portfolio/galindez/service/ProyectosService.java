package com.portfolio.galindez.service;

import com.portfolio.galindez.model.Persona;
import com.portfolio.galindez.model.Proyectos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProyectosService {

    public Proyectos crearProyecto(Proyectos proyectos);

    public List<Proyectos> verProyectos();

    public Proyectos verProyecto(long id);

    public Proyectos modificarProyecto(long id, Proyectos proyectos);

    public void eliminarProyecto(long id);


}
