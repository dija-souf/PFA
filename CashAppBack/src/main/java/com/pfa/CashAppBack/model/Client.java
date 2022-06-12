package com.pfa.CashAppBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	// La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
	//AUTO_INCREMENT
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id_client;
	
	@Column(length=50,nullable=false) 
	private String nom_client;
	
	@Column(length=50,nullable=false) 
	private String prenom_client;
	
	@Column(length=50,nullable=false) 
	private Integer tele_client;

	public Integer getId_client() {
		return id_client;
	}

	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}

	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}

	public String getPrenom_client() {
		return prenom_client;
	}

	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}

	public Integer getTele_client() {
		return tele_client;
	}

	public void setTele_client(Integer tele_client) {
		this.tele_client = tele_client;
	}
	 
	
	

}
