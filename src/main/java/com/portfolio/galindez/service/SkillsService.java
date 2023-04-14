package com.portfolio.galindez.service;

import com.portfolio.galindez.model.Skills;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SkillsService {

    public Skills crearSkill(Skills skills);

    public List<Skills> verSkills();

    public Skills verSkill(long id);

    public Skills modificarSkill(long id, Skills skills);

    public void eliminarSkill(long id);


}
