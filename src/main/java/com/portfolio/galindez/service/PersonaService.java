package com.portfolio.galindez.service;

import com.portfolio.galindez.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PersonaService {

    public Persona crearPersona(Persona persona);

    public List<Persona> verPersonas();

    public Persona verPersona(long id);

    public Persona modificarPersona(long id, Persona persona);

    public void eliminarPersona(long id);

}
