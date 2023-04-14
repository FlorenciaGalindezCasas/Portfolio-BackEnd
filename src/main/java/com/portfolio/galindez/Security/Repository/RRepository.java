package com.portfolio.galindez.Security.Repository;

import java.util.Optional;
import com.portfolio.galindez.Security.Entity.Rol;
import com.portfolio.galindez.Security.Enums.RolName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolName(RolName rolName);
}
