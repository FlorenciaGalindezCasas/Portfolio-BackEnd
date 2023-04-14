package com.portfolio.galindez.service;

import com.portfolio.galindez.model.Persona;
import com.portfolio.galindez.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImplements implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public List<Persona> verPersonas() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Persona verPersona(long id) {
        return personaRepository.findById(id).get();
    }

    @Override
    public Persona modificarPersona(long id,Persona persona) {
        Persona persona1  = personaRepository.findById(id).get();
        persona1.setBanner(persona.getBanner());
        persona1.setImg(persona.getImg());
        persona1.setNombreCompleto(persona.getNombreCompleto());
        persona1.setTitulo(persona.getTitulo());
        persona1.setDescripcion(persona.getDescripcion());
        return personaRepository.save(persona1);
    }

    @Override
    public void eliminarPersona(long id) {
        personaRepository.deleteById(id);
    }
}
