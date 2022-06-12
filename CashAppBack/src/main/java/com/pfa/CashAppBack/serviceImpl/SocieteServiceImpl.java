package com.pfa.CashAppBack.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfa.CashAppBack.model.Societe;
import com.pfa.CashAppBack.repository.SocieteRepository;
import com.pfa.CashAppBack.service.SocieteService;

@Component
@Service("societeServiceImpl")
@Transactional
public class SocieteServiceImpl implements SocieteService{

	@Autowired
	private SocieteRepository societeRepository;
	
	@Override
	public Optional<Societe> findById(Integer id) {
		
		return societeRepository.findById(id);
	}

	@Override
	public List<Societe> findByAll() {
		
		return societeRepository.findAll();
	}

	@Override
	public Societe save(Societe societe) {
		return societeRepository.save(societe);
	}

	@Override
	public Boolean delete(Integer id) {
		
		try {
			societeRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			e.getMessage();
		}

		return false;
	}
	}


