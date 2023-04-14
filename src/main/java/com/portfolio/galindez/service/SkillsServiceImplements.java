package com.portfolio.galindez.service;

import com.portfolio.galindez.model.Skills;
import com.portfolio.galindez.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsServiceImplements implements SkillsService{

    @Autowired
    private SkillsRepository skillsRepository;

    @Override
    public Skills crearSkill(Skills skills){
        return skillsRepository.save(skills);
    }

    @Override
    public List<Skills> verSkills(){
        return (List<Skills>) skillsRepository.findAll();
    }

    @Override
    public Skills verSkill(long id){
        return skillsRepository.findById(id).get();
    }

    @Override
    public Skills modificarSkill(long id, Skills skills){
        Skills skills1 = skillsRepository.findById(id).get();
        skills1.setTitulo(skills.getTitulo());
        skills1.setIcono(skills.getIcono());
        skills1.setPorcentaje(skills.getPorcentaje());
        return skillsRepository.save(skills1);
    }

    @Override
    public void eliminarSkill(long id){
        skillsRepository.deleteById(id);
    }
}
