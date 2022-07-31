
package com.backend.backend.Segurity.Repository;

import com.backend.backend.Segurity.Entity.Rol;
import com.backend.backend.Segurity.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
