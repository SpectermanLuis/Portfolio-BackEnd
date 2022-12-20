package com.ap_portfolio_los.tp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Persona {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotNull
private String nombre;
@NotNull
private String apellido;
private String fotoperfil;
@NotNull
private String acercademi;
private String imagen_background;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFotoperfil() {
        return fotoperfil;
    }

    public void setFotoperfil(String fotoperfil) {
        this.fotoperfil = fotoperfil;
    }

    public String getAcercademi() {
        return acercademi;
    }

    public void setAcercademi(String acercademi) {
        this.acercademi = acercademi;
    }

    public String getImagen_background() {
        return imagen_background;
    }

    public void setImagen_background(String imagen_background) {
        this.imagen_background = imagen_background;
    }





}
