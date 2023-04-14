package com.portfolio.galindez.controller;

import com.portfolio.galindez.model.Persona;
import com.portfolio.galindez.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/agregar")
    public Persona crearPersona(@RequestBody Persona persona){
        Persona persona1 = personaService.crearPersona(persona);
        return  persona1;
    }
    @GetMapping("/ver")
    public List<Persona> verPersonas() {
       return personaService.verPersonas();
    }

    @GetMapping("/ver/{id}")
    public Persona verPersona(@PathVariable("id") long id){
        return personaService.verPersona(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/{id}")
    public Persona modificarPersona(@PathVariable("id") long id, @RequestBody Persona persona){
        return personaService.modificarPersona(id, persona);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable("id") long id) {
        personaService.eliminarPersona(id);
        return "Persona {id} ha sido eliminada";
    }
}
