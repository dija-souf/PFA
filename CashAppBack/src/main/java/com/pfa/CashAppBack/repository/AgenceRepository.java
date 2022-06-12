package com.pfa.CashAppBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.pfa.CashAppBack.model.Agence;





public interface AgenceRepository extends JpaRepository<Agence, Integer>, JpaSpecificationExecutor<Agence> {

}
