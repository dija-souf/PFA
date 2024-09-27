package com.pfa.CashAppBack.rest;

import java.util.Collection;
import java.util.List;

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

import com.pfa.CashAppBack.model.Client;
import com.pfa.CashAppBack.model.Societe;
import com.pfa.CashAppBack.service.ClientService;
import com.pfa.CashAppBack.service.SocieteService;

@RestController
@RequestMapping("/rest")
public class SocieteRest {
	 @Autowired
	    private SocieteService societeservice;
	    
	    
	    @GetMapping(value = "/societe/all")
	    public Collection<Societe>  gatAll()  { 
	
	        return societeservice.findByAll();
	    }
		
		
		
		/*  @GetMapping(value = "/societe/{id}") 
		  public ResponseEntity<Client> get(@PathVariable Integer id) { 
			  Integer a=clientService.findById(id);
			  return new ResponseEntity<>(, HttpStatus.OK); 
			  
		  }
		
		*/
		@PostMapping(value = "/societe/save")
	    public ResponseEntity<Societe> save(@RequestBody Societe societe) {
			Societe resultat =  societeservice.save(societe);
	        if(resultat != null) {
	         	return new ResponseEntity<>(resultat, HttpStatus.OK);
	        } else {
	        	return new ResponseEntity<>(resultat,HttpStatus.CONFLICT );
	        }
	    }
		
		
		@DeleteMapping(value = "/societe/delete/{id}")
	    public Boolean delete(@PathVariable Integer id) {
	        return societeservice.delete(id);
	    }
	    

}
