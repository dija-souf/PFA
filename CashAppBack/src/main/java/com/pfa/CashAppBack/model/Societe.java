package com.pfa.CashAppBack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "societe")
//the Serializable interface when you need to store a copy of the object, send them to another process which runs on the same system or over the network.
//It makes storing and sending objects easy
public class Societe implements Serializable{
	
	@Id
	// La génération de la clé primaire se fera à partir d’une Identité propre au SGBD. Il utilise un type de colonne spéciale à la base de données.
	//AUTO_INCREMENT
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id_societe;
	
	@Column(length=50,nullable=false)
	private String nom_societe;
	
	@Column(length=50,nullable=false)
    private String adresse_societe;
	
	@Column(length=255,nullable=false, unique = true)
    private String email_societe;
	
	@Column(length=50,nullable=false)
    private Integer tele_societe;
	
	@Column(length=50,nullable=false)
    private Integer valeurRisque;
	
	public Integer getId_societe() {
		return id_societe;
	}
	public void setId_societe(Integer id_societe) {
		this.id_societe = id_societe;
	}
	public String getNom_societe() {
		return nom_societe;
	}
	public void setNom_societe(String nom_societe) {
		this.nom_societe = nom_societe;
	}
	public String getAdresse_societe() {
		return adresse_societe;
	}
	public void setAdresse_societe(String adresse_societe) {
		this.adresse_societe = adresse_societe;
	}
	public String getEmail_societe() {
		return email_societe;
	}
	public void setEmail_societe(String email_societe) {
		this.email_societe = email_societe;
	}
	public Integer getTele_societe() {
		return tele_societe;
	}
	public void setTele_societe(Integer tele_societe) {
		this.tele_societe = tele_societe;
	}
	public Integer getValeurRisque() {
		return valeurRisque;
	}
	public void setValeurRisque(Integer valeurRisque) {
		this.valeurRisque = valeurRisque;
	}
    
    
}
