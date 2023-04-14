package com.portfolio.galindez.service;

import com.portfolio.galindez.model.Educacion;
import com.portfolio.galindez.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionServiceImplements implements EducacionService{
    @Autowired
    private EducacionRepository educacionRepository;

    @Override
    public Educacion crearEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }

    @Override
    public List<Educacion> listaEducacion(){
        return (List<Educacion>) educacionRepository.findAll();
    }

    @Override
    public Educacion verEducacion(long id){
        return educacionRepository.findById(id).get();
    }

    @Override
    public Educacion modificarEducacion(long id, Educacion educacion){
        Educacion educacion1  = educacionRepository.findById(id).get();
        educacion1.setTitulo(educacion.getTitulo());
        educacion1.setInstitucion(educacion.getInstitucion());
        educacion1.setInicio(educacion.getInicio());
        educacion1.setEstado(educacion.getEstado());
        educacion1.setLogo(educacion.getLogo());
        return educacionRepository.save(educacion1);
    }

    @Override
    public void eliminarEducacion(long id){
        educacionRepository.deleteById(id);
    }

}
