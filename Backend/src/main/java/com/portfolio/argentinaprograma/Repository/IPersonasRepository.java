package com.portfolio.argentinaprograma.Repository;

import com.portfolio.argentinaprograma.Entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonasRepository extends JpaRepository<Personas,Long> {
    
}
