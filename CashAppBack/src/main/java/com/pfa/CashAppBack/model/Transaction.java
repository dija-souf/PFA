package com.pfa.CashAppBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	
	@Id
	// La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
	//AUTO_INCREMENT
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id_transaction;
	
	@Column(length=50,nullable=false) 
	private Double montant_transaction;
	
	@Column(length=50,nullable=false) 
	private Byte[] recu_transaction;

	@Column(length=50,nullable=false) 
	public Integer getId_transaction() {
		return id_transaction;
	}

	public void setId_transaction(Integer id_transaction) {
		this.id_transaction = id_transaction;
	}

	public Double getMontant_transaction() {
		return montant_transaction;
	}

	public void setMontant_transaction(Double montant_transaction) {
		this.montant_transaction = montant_transaction;
	}

	public Byte[] getRecu_transaction() {
		return recu_transaction;
	}

	public void setRecu_transaction(Byte[] recu_transaction) {
		this.recu_transaction = recu_transaction;
	}
	
	

}
