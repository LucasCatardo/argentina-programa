package com.portfolio.argentinaprograma.Controller;

import com.portfolio.argentinaprograma.Entity.Users;
import com.portfolio.argentinaprograma.Interface.IUsersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    
    @Autowired IUsersService iUsersService;
    
    @GetMapping("users/findall")
    public List<Users> getUsers() {
        return iUsersService.getUsers();
    }
    
    @PostMapping("users/create")
    public String createUser(@RequestBody Users user) {
        iUsersService.saveUser(user);
        return "El usuario fue creado exitosamente.";
    }
    
    @DeleteMapping("users/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        iUsersService.deleteUser(id);
        return "El usuario fue eliminado exitosamente.";
    }
    
    @PutMapping("users/edit/{id}")
    public Users editUser(@PathVariable Long id, @RequestParam("nombre") String newNombre, @RequestParam("apellido") String newApellido, @RequestParam("imagen") String newImagen) {
        Users user = iUsersService.findUser(id);
        
        user.setNombre(newNombre);
        user.setApellido(newApellido);
        user.setImagen(newImagen);
        
        iUsersService.saveUser(user);
        
        return user;
    }
}
