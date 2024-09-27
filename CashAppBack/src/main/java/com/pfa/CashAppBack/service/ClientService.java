package com.pfa.CashAppBack.service;

import java.util.List;
import java.util.Optional;

import com.pfa.CashAppBack.model.Client;

public interface ClientService {

	  Optional<Client> findById(Integer id);
		
			List<Client> findByAll();

			Client save(final Client client);

			Boolean delete(Integer id);
}
