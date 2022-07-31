
package com.backend.backend.Segurity.Servi;

import com.backend.backend.Segurity.Entity.Usuario;
import com.backend.backend.Segurity.Repository.IUserRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServi {
    @Autowired
    IUserRepository iuserRepository ;
    
    public Optional<Usuario>getByNombreUsuario(String nombreUsuario){
        return iuserRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iuserRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return iuserRepository.existsByEmail(email);
    }
    public void save(Usuario usuario){
        iuserRepository.save(usuario);
    }
}
