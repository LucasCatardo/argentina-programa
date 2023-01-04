package com.portfolio.argentinaprograma.Interface;

import com.portfolio.argentinaprograma.Entity.Personas;
import java.util.List;

public interface IPersonasService {
    
    public List<Personas> getPersonas();
    
    public void savePersona(Personas persona);
    
    public void deletePersona(Long id);
    
    public Personas findPersona(Long id);
}
