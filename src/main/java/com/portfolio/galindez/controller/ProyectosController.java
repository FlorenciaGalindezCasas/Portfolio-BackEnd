package com.portfolio.galindez.controller;

import com.portfolio.galindez.model.Proyectos;
import com.portfolio.galindez.service.ProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proyectos")
@CrossOrigin(origins = "*")
public class ProyectosController {

    @Autowired
    private ProyectosService proyectosService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/agregar")
    public Proyectos crearProyecto(@RequestBody Proyectos proyectos){
        Proyectos proyectos1 = proyectosService.crearProyecto((proyectos));
        return proyectos1;
    }

    @GetMapping("/ver")
    public List<Proyectos> verProyectos(){
        return proyectosService.verProyectos();
    }

    @GetMapping("/ver/{id}")
    public Proyectos verProyecto(@PathVariable("id") long id){
        return proyectosService.verProyecto(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/{id}")
    public Proyectos modificarProyecto(@PathVariable("id") long id, @RequestBody Proyectos proyectos){
        return proyectosService.modificarProyecto(id, proyectos);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public String eliminarProyecto(@PathVariable("id") long id){
        proyectosService.eliminarProyecto(id);
        return "Proyecto {id} ha sido eliminado";
    }
}
