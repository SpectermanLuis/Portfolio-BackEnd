package com.ap_portfolio_los.tp.Service;

import com.ap_portfolio_los.tp.Entity.Habilidad;
import com.ap_portfolio_los.tp.Interface.IHabilidadService;
import com.ap_portfolio_los.tp.Repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {

    @Autowired HabilidadRepository habilidadRepository;
    
    @Override
    public List<Habilidad> getHabilidad() {
     List<Habilidad> habilidad = habilidadRepository.findAll();
     return habilidad;
    }

    @Override
    public void saveHabilidad(Habilidad habilidad) {
      habilidadRepository.save(habilidad);
    }

    @Override
    public void deleteHabilidad(Long id) {
      habilidadRepository.deleteById(id);
    }

    @Override
    public Habilidad findHabilidad(Long id) {
      Habilidad habilidad = habilidadRepository.findById(id).orElse(null);
      return habilidad;
    }
    
}

