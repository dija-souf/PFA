package com.pfa.CashAppBack.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfa.CashAppBack.model.Client;
import com.pfa.CashAppBack.repository.ClientRepository;
import com.pfa.CashAppBack.service.ClientService;

@Component
@Service("clientServiceImpl")
@Transactional
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public Optional<Client> findById(Integer id) {
		
		return clientRepository.findById(id);
	}

	@Override
	public List<Client> findByAll() {
	
		return clientRepository.findAll();
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Boolean delete(Integer id) {
		try {
			clientRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			e.getMessage();
		}

		return false;
	}
	}


