
package com.backend.backend.Interface;

import com.backend.backend.Entity.Persona;
import java.util.List;



public interface IPersonaServi {
    //Traer lista de persona persona
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por ID
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);

   
}
