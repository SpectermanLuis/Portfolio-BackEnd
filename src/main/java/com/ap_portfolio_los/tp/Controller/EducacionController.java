package com.ap_portfolio_los.tp.Controller;

import com.ap_portfolio_los.tp.Entity.Educacion;
import com.ap_portfolio_los.tp.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EducacionController {
    
 @Autowired IEducacionService ieducacionService;
 
 @GetMapping("/educacion/traer")   
 public List<Educacion> getEducacion() {
 return ieducacionService.getEducacion();
 }

@PostMapping("/educacion/crear")
public String createEducacion(@RequestBody Educacion educacion){
ieducacionService.saveEducacion(educacion);
return "Educacion Creada OK";
}

@DeleteMapping("/educacion/borrar/{id}")
public String deleteEducacion(@PathVariable Long id)
{
   ieducacionService.deleteEducacion(id);
   return "Educacion Borrada Ok" ;
}

@PutMapping("/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
                               @RequestParam("inicio") String nuevoInicio,
                               @RequestParam("fin") String nuevoFin,
                               @RequestParam("logo") String nuevoLogo,
                               @RequestParam("nivel") String nuevoNivel)  
                {
        Educacion educacion = ieducacionService.findEducacion(id);
        
        educacion.setInicio(nuevoInicio);
        educacion.setFin(nuevoFin);
        educacion.setLogo(nuevoLogo);
        educacion.setNivel(nuevoNivel);
        
        ieducacionService.saveEducacion(educacion);
        return educacion;
    }
    
    @GetMapping("/educacion/buscar/{id}")
    public Educacion buscarEducacion(@PathVariable Long id){
        Educacion educacion = ieducacionService.findEducacion(id);
      return educacion;  
    } 

}

