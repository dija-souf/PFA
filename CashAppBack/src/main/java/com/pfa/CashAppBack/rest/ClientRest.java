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
import com.pfa.CashAppBack.service.ClientService;



@RestController
//It is used to map web requests onto specific handler classes and/or handler methods
//the URL shall be relative, it shall be  : http://localhost:8080/rest/
@RequestMapping("/rest")
public class ClientRest {
	
	 @Autowired
	    private ClientService clientService;
	    
	    
	    @GetMapping(value = "/client/all")
	    public ResponseEntity<Collection<Client>> gatAll()  { 
	        List<Client> resultat = clientService.findByAll();
	        return new ResponseEntity<>(resultat, HttpStatus.OK);
	    }
		
		
		
		/*  @GetMapping(value = "/client/{id}") 
		  public ResponseEntity<Client> get(@PathVariable Integer id) { 
			  Integer a=clientService.findById(id);
			  return new ResponseEntity<>(, HttpStatus.OK); 
			  
		  }
		
		*/
		@PostMapping(value = "/client/save")
	    public ResponseEntity<Client> save(@RequestBody Client client) {
			Client resultat =  clientService.save(client);
	        if(resultat != null) {
	         	return new ResponseEntity<>(resultat, HttpStatus.OK);
	        } else {
	        	return new ResponseEntity<>(resultat,HttpStatus.CONFLICT );
	        }
	    }
		
		
		@DeleteMapping(value = "/client/delete/{id}")
	    public Boolean delete(@PathVariable Integer id) {
	        return clientService.delete(id);
	    }
	    
	    

}
