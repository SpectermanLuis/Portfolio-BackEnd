package com.ap_portfolio_los.tp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trabajo {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)        
Long id;
private String inicio;
private String fin;
private String tarea;
private String logo;

    public Trabajo() {
    }

    public Trabajo(String inicio, String fin, String tarea, String logo) {
        this.inicio = inicio;
        this.fin = fin;
        this.tarea = tarea;
        this.logo = logo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
  

}