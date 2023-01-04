package com.portfolio.argentinaprograma.Security.Service;

import com.portfolio.argentinaprograma.Security.Entity.Role;
import com.portfolio.argentinaprograma.Security.Enums.RoleName;
import com.portfolio.argentinaprograma.Security.Repository.iRoleRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {
    
    @Autowired
    iRoleRepository iRoleRepository;
    
    public Optional<Role> getByRoleName(RoleName roleName) {
        return iRoleRepository.findByRoleName(roleName);
    }
    
    public void save(Role role) {
        iRoleRepository.save(role);
    }
}
