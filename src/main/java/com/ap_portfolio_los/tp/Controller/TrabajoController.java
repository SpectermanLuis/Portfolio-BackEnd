package com.ap_portfolio_los.tp.Controller;

import com.ap_portfolio_los.tp.Entity.Trabajo;
import com.ap_portfolio_los.tp.Interface.ITrabajoService;
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
public class TrabajoController {
    
 @Autowired ITrabajoService itrabajoService;
 
 @GetMapping("/trabajo/traer")   
 public List<Trabajo> getTrabajo() {
 return itrabajoService.getTrabajo();
 }

@PostMapping("/trabajo/crear")
public String createTrabajo(@RequestBody Trabajo trabajo){
itrabajoService.saveTrabajo(trabajo);
return "Trabajo Creado OK";
}

@DeleteMapping("/trabajo/borrar/{id}")
public String deleteTrabajo(@PathVariable Long id)
{
   itrabajoService.deleteTrabajo(id);
   return "Trabajo Borrado Ok" ;
}

@PutMapping("/trabajo/editar/{id}")
    public Trabajo editTrabajo(@PathVariable Long id,
                               @RequestParam("inicio") String nuevoInicio,
                               @RequestParam("fin") String nuevoFin,
                               @RequestParam("tarea") String nuevoTarea,
                               @RequestParam("logo") String nuevoLogo)  
                {
        Trabajo trabajo = itrabajoService.findTrabajo(id);
        
        trabajo.setInicio(nuevoInicio);
        trabajo.setFin(nuevoFin);
        trabajo.setTarea(nuevoTarea);
        trabajo.setLogo(nuevoLogo);
        
        itrabajoService.saveTrabajo(trabajo);
        return trabajo;
    }
    
    @GetMapping("/trabajo/buscar/{id}")
    public Trabajo buscarTrabajo(@PathVariable Long id){
        Trabajo trabajo = itrabajoService.findTrabajo(id);
      return trabajo;  
    } 

}
