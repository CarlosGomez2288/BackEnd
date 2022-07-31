
package com.backend.backend.Repository;

import com.backend.backend.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpersonaRepository extends JpaRepository<Persona, Long>{
       
}
