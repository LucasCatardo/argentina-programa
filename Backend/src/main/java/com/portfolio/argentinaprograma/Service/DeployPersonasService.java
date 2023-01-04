package com.portfolio.argentinaprograma.Service;

import com.portfolio.argentinaprograma.Entity.Personas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.argentinaprograma.Interface.IPersonasService;
import com.portfolio.argentinaprograma.Repository.IPersonasRepository;

@Service
public class DeployPersonasService implements IPersonasService {

    @Autowired IPersonasRepository iPersonasRepository;
    
    @Override
    public List<Personas> getPersonas() {
        List<Personas> personas = iPersonasRepository.findAll();
        return personas;
    }

    @Override
    public void savePersona(Personas persona) {
        iPersonasRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        iPersonasRepository.deleteById(id);
    }

    @Override
    public Personas findPersona(Long id) {
        Personas persona = iPersonasRepository.findById(id).orElse(null);
        return persona;
    }
}
