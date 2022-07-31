
package com.backend.backend.Segurity.Servi;

import com.backend.backend.Segurity.Entity.Rol;
import com.backend.backend.Segurity.Enums.RolNombre;
import com.backend.backend.Segurity.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolServi {
    @Autowired
    IRolRepository irolRepository;
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
