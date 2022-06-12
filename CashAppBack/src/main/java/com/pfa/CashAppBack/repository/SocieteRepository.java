package com.pfa.CashAppBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.pfa.CashAppBack.model.Societe;


public interface SocieteRepository extends JpaRepository<Societe, Integer>, JpaSpecificationExecutor<Societe>{

}
