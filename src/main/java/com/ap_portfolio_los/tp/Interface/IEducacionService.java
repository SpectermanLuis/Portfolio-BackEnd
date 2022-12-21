package com.ap_portfolio_los.tp.Interface;

import com.ap_portfolio_los.tp.Entity.Educacion;
import java.util.List;


public interface IEducacionService {

// Traer Lista de Estudios Realizados
public List<Educacion> getEducacion();    

// Grabar Educacion
public void saveEducacion(Educacion educacion);

// Borrar Educacion por Id
public void deleteEducacion(Long id);

// Buscar Educacion por Id
public Educacion findEducacion(Long id);
    
}
