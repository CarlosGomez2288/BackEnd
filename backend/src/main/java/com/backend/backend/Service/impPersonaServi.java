
package com.backend.backend.Service;

import com.backend.backend.Entity.Persona;
import com.backend.backend.Interface.IPersonaServi;
import com.backend.backend.Repository.IpersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class impPersonaServi implements IPersonaServi{

    @Autowired IpersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona  = ipersonaRepository.findById(id).orElse(null);
       return persona;      
    }

  

    public Persona findPersona(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
