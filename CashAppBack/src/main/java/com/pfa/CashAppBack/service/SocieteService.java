package com.pfa.CashAppBack.service;

import java.util.List;
import java.util.Optional;

import com.pfa.CashAppBack.model.Societe;
public interface SocieteService {
	
	
	 Optional<Societe> findById(Integer id);
		
		List<Societe> findByAll();
		
		Societe save(Societe societe);

		Boolean delete(Integer id);

		
}
