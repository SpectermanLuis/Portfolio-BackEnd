package com.ap_portfolio_los.tp.Controller;

import com.ap_portfolio_los.tp.Entity.Habilidad;
import com.ap_portfolio_los.tp.Interface.IHabilidadService;
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
public class HabilidadController {
    
 @Autowired IHabilidadService ihabilidadService;
 
 @GetMapping("/habilidad/traer")   
 public List<Habilidad> getHabilidad() {
 return ihabilidadService.getHabilidad();
 }

@PostMapping("/habilidad/crear")
public String createHabilidad(@RequestBody Habilidad habilidad){
ihabilidadService.saveHabilidad(habilidad);
return "Habilidad Creada OK";
}

@DeleteMapping("/habilidad/borrar/{id}")
public String deleteHabilidad(@PathVariable Long id)
{
   ihabilidadService.deleteHabilidad(id);
   return "Habilidad Borrada Ok" ;
}

@PutMapping("/habilidad/editar/{id}")
    public Habilidad editHabilidad(@PathVariable Long id,
                               @RequestParam("logo") String nuevoLogo,
                               @RequestParam("porcentaje") String nuevoPorcentaje,
                               @RequestParam("descripcion") String nuevoDescripcion,
                               @RequestParam("color") String nuevoColor)  
                {
        Habilidad habilidad = ihabilidadService.findHabilidad(id);
        
        habilidad.setLogo(nuevoLogo);
        habilidad.setPorcentaje(nuevoPorcentaje);
        habilidad.setDescripcion(nuevoDescripcion);
        habilidad.setColor(nuevoColor);        
        
        ihabilidadService.saveHabilidad(habilidad);
        return habilidad;
    }
    
    @GetMapping("/habilidad/buscar/{id}")
    public Habilidad buscarHabilidad(@PathVariable Long id){
        Habilidad habilidad = ihabilidadService.findHabilidad(id);
      return habilidad;  
    } 

}