package com.pfa.CashAppBack.service;

import java.util.List;
import java.util.Optional;

import com.pfa.CashAppBack.model.Agence;


public interface AgenceService {

	//findById returns an Optional of something, meaning that we either have a single result for a given id or we don't have anything for that.
	    Optional<Agence> findById(Integer id);
		
		List<Agence> findByAll();

		Agence save(Agence agence);

		Boolean delete(Integer id);
}
