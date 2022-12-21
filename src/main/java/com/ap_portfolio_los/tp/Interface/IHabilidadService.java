package com.ap_portfolio_los.tp.Interface;

import com.ap_portfolio_los.tp.Entity.Habilidad;
import java.util.List;

public interface IHabilidadService {

// Traer Lista de Habilidades
public List<Habilidad> getHabilidad();    

// Grabar Habilidad
public void saveHabilidad(Habilidad habilidad);

// Borrar Habilidad por Id
public void deleteHabilidad(Long id);

// Buscar Habilidad  por Id
public Habilidad findHabilidad(Long id);
    
}
