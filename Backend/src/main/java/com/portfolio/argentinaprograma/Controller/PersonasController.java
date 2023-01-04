package com.portfolio.argentinaprograma.Controller;

import com.portfolio.argentinaprograma.Entity.Personas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.argentinaprograma.Interface.IPersonasService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonasController {
    
    @Autowired IPersonasService iPersonasService;
    
    @GetMapping("personas/findall")
    public List<Personas> getPersonas() {
        return iPersonasService.getPersonas();
    }
    
    @PostMapping("personas/create")
    public String createPersona(@RequestBody Personas persona) {
        iPersonasService.savePersona(persona);
        return "La persona fue creada exitosamente.";
    }
    
    @DeleteMapping("personas/delete/{id}")
    public String deletePersona(@PathVariable Long id) {
        iPersonasService.deletePersona(id);
        return "La persona fue eliminada exitosamente.";
    }
    
    @PutMapping("personas/edit/{id}")
    public Personas editPersona(@PathVariable Long id, @RequestParam("nombre") String newNombre, @RequestParam("apellido") String newApellido, @RequestParam("imagen") String newImagen) {
        Personas persona = iPersonasService.findPersona(id);
        
        persona.setNombre(newNombre);
        persona.setApellido(newApellido);
        persona.setImagen(newImagen);
        
        iPersonasService.savePersona(persona);
        
        return persona;
    }
    
    @GetMapping("personas/find/{id}")
    public Personas getPersona(@PathVariable Long id) {
        return iPersonasService.findPersona(id);
    }
}
