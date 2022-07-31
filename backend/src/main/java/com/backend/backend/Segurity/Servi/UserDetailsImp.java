
package com.backend.backend.Segurity.Servi;

import com.backend.backend.Segurity.Entity.UserPrincipal;
import com.backend.backend.Segurity.Entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImp implements UserDetailsService{
    @Autowired
    UserServi userServi;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = userServi.getByNombreUsuario(nombreUsuario).get();
        return UserPrincipal.build(usuario);
    }
    
    
}
