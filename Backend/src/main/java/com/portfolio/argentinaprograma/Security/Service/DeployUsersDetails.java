package com.portfolio.argentinaprograma.Security.Service;

import com.portfolio.argentinaprograma.Security.Entity.Users;
import com.portfolio.argentinaprograma.Security.Entity.UsersPrimary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DeployUsersDetails implements UserDetailsService {
    
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
        Users user = userService.getByUsuario(usuario).get();
        return UsersPrimary.build(user);
    }
}
