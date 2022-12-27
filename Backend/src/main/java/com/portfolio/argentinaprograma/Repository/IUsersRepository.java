package com.portfolio.argentinaprograma.Repository;

import com.portfolio.argentinaprograma.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends JpaRepository<Users,Long> {
    
}
