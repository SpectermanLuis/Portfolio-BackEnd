package com.ap_portfolio_los.tp.Controller;

import com.ap_portfolio_los.tp.Entity.Persona;
import com.ap_portfolio_los.tp.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
 @Autowired IPersonaService ipersonaService;
 
 @GetMapping("/persona/traer")   
 public List<Persona> getPersona() {
 return ipersonaService.getPersona();
 }

@PostMapping("/persona/crear")
public String createPersona(@RequestBody Persona persona){
ipersonaService.savePersona(persona);
return "Persona Creada OK";
}

@DeleteMapping("/persona/borrar/{id}")
public String deletePersona(@PathVariable Long id)
{
   ipersonaService.deletePersona(id);
   return "Persona Borrada Ok" ;
}

@PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("fotoperfil") String nuevoFotoperfil,
                               @RequestParam("acercademi") String nuevoAcercademi)  
                {
        Persona persona = ipersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setFotoperfil(nuevoFotoperfil);
        persona.setAcercademi(nuevoAcercademi);
        
        ipersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/persona/buscar/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        Persona persona = ipersonaService.findPersona(id);
      return persona;  
    } 
    


}

