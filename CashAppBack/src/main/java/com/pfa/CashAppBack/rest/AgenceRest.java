package com.pfa.CashAppBack.rest;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.CashAppBack.model.Agence;
import com.pfa.CashAppBack.service.AgenceService;




//Elle indique à Spring d’insérer le retour de la méthode au format JSON dans le corps de la réponse HTTP. Grâce à ce deuxième point, les applications qui vont communiquer avec votre API accéderont au résultat de leur requête en parsant la réponse HTTP.
@RestController
//It is used to map web requests onto specific handler classes and/or handler methods
//the URL shall be relative, it shall be  : http://localhost:8080/rest/
@RequestMapping("/rest")
public class AgenceRest {

    @Autowired
    private AgenceService agenceService;
    
    
    @GetMapping(value = "/agence/all")
    public ResponseEntity<Collection<Agence>> gatAll()  { 
        List<Agence> resultat = agenceService.findByAll();
        return new ResponseEntity<>(resultat, HttpStatus.OK);
    }
	
	
	
	  @GetMapping(value = "/agence/{id}") 
	  public Optional<Agence> get(@PathVariable Integer id) { 
		  return agenceService.findById(id);

		  
	  }
	
	
	@PostMapping(value = "/agence/save")
    public ResponseEntity<Agence> save(@RequestBody Agence agence) {
		Agence resultat =  agenceService.save(agence);
        if(resultat != null) {
         	return new ResponseEntity<>(resultat, HttpStatus.OK);
        } else {
        	return new ResponseEntity<>(resultat,HttpStatus.CONFLICT );
        }
    }
	
	
	@DeleteMapping(value = "/agence/delete/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return agenceService.delete(id);
    }
    
    
	
}
