
package com.backend.backend.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
 
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long ID;
   

   private String nombre;
   private String apellido;

}
