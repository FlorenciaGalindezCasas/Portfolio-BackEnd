package com.portfolio.galindez.Security.Service;

import com.portfolio.galindez.Security.Entity.Rol;
import com.portfolio.galindez.Security.Enums.RolName;
import com.portfolio.galindez.Security.Repository.RRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RRepository rRepository;
    
    public Optional<Rol> getByRolName(RolName rolName){
    
        return rRepository.findByRolName(rolName);
    }
    
    public void save(Rol rol){
        rRepository.save(rol);
    }
    
}
