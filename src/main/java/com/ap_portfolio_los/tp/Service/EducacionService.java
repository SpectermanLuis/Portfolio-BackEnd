package com.ap_portfolio_los.tp.Service;

import com.ap_portfolio_los.tp.Entity.Educacion;
import com.ap_portfolio_los.tp.Interface.IEducacionService;
import com.ap_portfolio_los.tp.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired EducacionRepository educacionRepository;
    
    @Override
    public List<Educacion> getEducacion() {
     List<Educacion> educacion = educacionRepository.findAll();
     return educacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
      educacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
      educacionRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
      Educacion educacion = educacionRepository.findById(id).orElse(null);
      return educacion;
    }
    
}
