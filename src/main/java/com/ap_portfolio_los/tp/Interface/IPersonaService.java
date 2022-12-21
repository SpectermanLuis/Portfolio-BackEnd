package com.ap_portfolio_los.tp.Interface;

import com.ap_portfolio_los.tp.Entity.Persona;
import java.util.List;

public interface IPersonaService {

// Traer Lista de Personas
public List<Persona> getPersona();    

// Grabar Persona
public void savePersona(Persona persona);

// Borrar Persona por Id
public void deletePersona(Long id);

// Buscar Persona por Id
public Persona findPersona(Long id);
    
}
