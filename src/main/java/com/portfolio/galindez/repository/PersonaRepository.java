package com.portfolio.galindez.repository;

import com.portfolio.galindez.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
}
