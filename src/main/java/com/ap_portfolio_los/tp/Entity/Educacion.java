package com.ap_portfolio_los.tp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)        
int id;
private String inicio;
private String fin;
private String logo;
private String nivel;

    public Educacion() {
    }

    public Educacion(String inicio, String fin, String logo, String nivel) {
        this.inicio = inicio;
        this.fin = fin;
        this.logo = logo;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

}
