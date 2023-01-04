package com.portfolio.argentinaprograma.Security.Entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsersPrimary implements UserDetails {
    
    private String nombre;
    private String usuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;
    
    public UsersPrimary(String nombre, String usuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    
    public static UsersPrimary build(Users user) {
        List<GrantedAuthority> authorities = user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getNombre().name())).collect(Collectors.toList());
        return new UsersPrimary(user.getNombre(), user.getUsuario(), user.getEmail(), user.getPassword(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String getUsername() {
        return usuario;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
