package com.portfolio.argentinaprograma.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Personas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Debe contener entre 1 y 50 caracteres.")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "Debe contener entre 1 y 50 caracteres.")
    private String apellido;
    
    @Size(min = 1, max = 250, message = "Debe contener entre 1 y 250 caracteres.")
    private String imagen;
}
