package com.ap_portfolio_los.tp.Interface;

import com.ap_portfolio_los.tp.Entity.Persona;
import jakarta.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.domain.AbstractPersistable;

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
