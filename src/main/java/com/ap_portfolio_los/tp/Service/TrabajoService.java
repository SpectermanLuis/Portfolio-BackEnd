package com.ap_portfolio_los.tp.Service;

import com.ap_portfolio_los.tp.Entity.Trabajo;
import com.ap_portfolio_los.tp.Interface.ITrabajoService;
import com.ap_portfolio_los.tp.Repository.TrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrabajoService implements ITrabajoService {

    @Autowired TrabajoRepository trabajoRepository;
    
    @Override
    public List<Trabajo> getTrabajo() {
     List<Trabajo> trabajo = trabajoRepository.findAll();
     return trabajo;
    }

    @Override
    public void saveTrabajo(Trabajo trabajo) {
      trabajoRepository.save(trabajo);
    }

    @Override
    public void deleteTrabajo(Long id) {
      trabajoRepository.deleteById(id);
    }

    @Override
    public Trabajo findTrabajo(Long id) {
      Trabajo trabajo = trabajoRepository.findById(id).orElse(null);
      return trabajo;
    }
    
}
