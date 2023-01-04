package com.portfolio.argentinaprograma.Security.Service;

import com.portfolio.argentinaprograma.Security.Entity.Users;
import com.portfolio.argentinaprograma.Security.Repository.iUserRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    
    @Autowired
    iUserRepository iUserRepository;
    
    public Optional<Users> getByUsuario(String usuario) {
        return iUserRepository.findByUsuario(usuario);
    }
    
    public boolean existsByUsuario(String usuario) {
        return iUserRepository.existsByUsuario(usuario);
    }
    
    public boolean existsByEmail(String email) {
        return iUserRepository.existsByEmail(email);
    }
    
    public void save(Users user) {
        iUserRepository.save(user);
    }
}
