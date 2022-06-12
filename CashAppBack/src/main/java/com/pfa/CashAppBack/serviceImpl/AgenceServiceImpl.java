package com.pfa.CashAppBack.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfa.CashAppBack.model.Agence;
import com.pfa.CashAppBack.repository.AgenceRepository;
import com.pfa.CashAppBack.service.AgenceService;




@Component
@Service("agenceServiceImpl")
@Transactional
public class AgenceServiceImpl implements AgenceService{

	@Autowired
	private AgenceRepository agenceRepository;


	@Override
	public Optional<Agence> findById(Integer id) {
		return agenceRepository.findById(id);
	}
	@Override
	public List<Agence> findByAll() {
		return agenceRepository.findAll();
	}

	@Override
	public Agence save(Agence agence) {
		return agenceRepository.save(agence);
	}

	@Override
	public Boolean delete(Integer id) {
		
		try {
			agenceRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			e.getMessage();
		}

		return false;
	}
	}

	


