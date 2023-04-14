package com.portfolio.galindez.service;

import com.portfolio.galindez.model.Educacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EducacionService {

    public Educacion crearEducacion(Educacion educacion
    );

    public List<Educacion> listaEducacion();

    public Educacion verEducacion(long id);

    public Educacion modificarEducacion(long id, Educacion educacion);

    public void eliminarEducacion(long id);
}
