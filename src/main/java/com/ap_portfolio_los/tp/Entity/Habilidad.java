package com.ap_portfolio_los.tp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Habilidad {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)        
Long id;
private String logo;
private String porcentaje;
private String descripcion;
private String color;

    public Habilidad() {
    }

    public Habilidad(String logo, String porcentaje, String descripcion, String color) {
        this.logo = logo;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

