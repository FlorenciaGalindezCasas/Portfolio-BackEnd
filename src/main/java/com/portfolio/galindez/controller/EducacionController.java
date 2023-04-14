package com.portfolio.galindez.controller;

import com.portfolio.galindez.model.Educacion;
import com.portfolio.galindez.service.EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("educacion")
@CrossOrigin(origins = "*")
public class EducacionController {

    @Autowired
    private EducacionService educacionService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/agregar")
    public Educacion crearEducacion(@RequestBody Educacion educacion){
        Educacion educacion1 = educacionService.crearEducacion(educacion);
        return educacion1;
    }

    @GetMapping("/ver")
    public List<Educacion> listaEducacion(){
        return educacionService.listaEducacion();
    }

    @GetMapping("/ver/{id}")
    public Educacion verEducacion(@PathVariable("id") long id){
        return educacionService.verEducacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/{id}")
    public Educacion modificarEducacion(@PathVariable("id") long id,@RequestBody Educacion educacion){
        return educacionService.modificarEducacion(id, educacion);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public String eliminarEducacion(@PathVariable("id") long id){
        educacionService.eliminarEducacion(id);
        return "Educacion {id} ha sido eliminada";
    }
}

