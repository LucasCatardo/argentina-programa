package com.portfolio.argentinaprograma.Security.Repository;

import com.portfolio.argentinaprograma.Security.Entity.Users;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUserRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByUsuario(String usuario);
    
    boolean existsByUsuario(String usuario);
    
    boolean existsByEmail(String email);
}
