package com.portfolio.galindez.controller;

import com.portfolio.galindez.model.Skills;
import com.portfolio.galindez.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("habilidades")
@CrossOrigin(origins = "*")
public class SkillsController {

    @Autowired
    private SkillsService skillsService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/agregar")
    public Skills crearSkill(@RequestBody Skills skills){
        Skills skills1 = skillsService.crearSkill(skills);
        return skills1;
    }

    @GetMapping("/ver")
    public List<Skills> verSkills(){
        return skillsService.verSkills();
    }

    @GetMapping("/ver/{id}")
    public Skills verSkill(@PathVariable("id") long id){
       return skillsService.verSkill(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/modificar/{id}")
    public Skills modificarSkill(@PathVariable("id") long id, @RequestBody Skills skills){
        return skillsService.modificarSkill(id, skills);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public String eliminarSkill(@PathVariable("id") long id){
        skillsService.eliminarSkill(id);
        return "Skill {id} ha sido eliminada";
    }
}
