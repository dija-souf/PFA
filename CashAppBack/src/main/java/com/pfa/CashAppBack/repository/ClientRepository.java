package com.pfa.CashAppBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.pfa.CashAppBack.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>, JpaSpecificationExecutor<Client>{

}
