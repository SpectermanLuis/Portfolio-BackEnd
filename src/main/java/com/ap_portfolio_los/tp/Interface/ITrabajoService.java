package com.ap_portfolio_los.tp.Interface;

import com.ap_portfolio_los.tp.Entity.Trabajo;
import java.util.List;

public interface ITrabajoService {

// Traer Lista de Trabajos 
public List<Trabajo> getTrabajo();    

// Grabar Trabajo
public void saveTrabajo(Trabajo trabajo);

// Borrar Trabajo por Id
public void deleteTrabajo(Long id);

// Buscar Trabajo por Id
public Trabajo findTrabajo(Long id);
    
}
