package com.portfolio.argentinaprograma.Security.Repository;

import com.portfolio.argentinaprograma.Security.Entity.Role;
import com.portfolio.argentinaprograma.Security.Enums.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(RoleName roleName);
}
