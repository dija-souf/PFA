package com.pfa.CashAppBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agence")
public class Agence {
	
	@Id
	// La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
	//AUTO_INCREMENT
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id_agence;

	@Column(length=50,nullable=false) 
	private String title_agence;

	@Column(length=55,nullable=false) 
	private String adresse_agence;

	@Column(length=15,nullable=false) 
	private Integer tele_agence;
	
	@Column(length=255,nullable=false) 
	private Double startCap_agence;
	
	
	public Integer getId_agence() {
		return id_agence;
	}
	public void setId_agence(Integer id_agence) {
		this.id_agence = id_agence;
	}
	public String getTitle_agence() {
		return title_agence;
	}
	public void setTitle_agence(String title_agence) {
		this.title_agence = title_agence;
	}
	public String getAdresse_agence() {
		return adresse_agence;
	}
	public void setAdresse_agence(String adresse_agence) {
		this.adresse_agence = adresse_agence;
	}
	public Integer getTele_agence() {
		return tele_agence;
	}
	public void setTele_agence(Integer tele_agence) {
		this.tele_agence = tele_agence;
	}
	public Double getStartCap_agence() {
		return startCap_agence;
	}
	public void setStartCap_agence(Double startCap_agence) {
		this.startCap_agence = startCap_agence;
	}
	
	
	
	
	
	
}
