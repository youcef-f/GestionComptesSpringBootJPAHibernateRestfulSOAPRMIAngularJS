package com.gestioncomptes.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity

// classe d'heritage
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_COMPTE", discriminatorType = DiscriminatorType.STRING, length = 2) // length = 2 =>
																										// "CC"=compteCourant
																										// ,
																										// "CE"=compteEpargne
// Gestion du restful via Json
// La classe "Compte" est abstraite. Pour etre néanmoins instanciable depuis le resControler par l'api jackson durant
// la methode **post**. Nous devons specifier quelles sont les classes qui en heritent. Ici les Classes compteCourant
// et CompteEpargne herites de cette classes.Pour les distingués, on demande à json de regarder la proprietés "typeCompte"
// lors de la methode poste et affecte respectivement soit "CC" et "CE" pour les compteCourant et compteEparge.
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeCompteCCCR") // "typeCompteCCCR"
																											// => Ici
																											// defini//
																											// arbitrairement.

@JsonSubTypes({ @Type(name = "CC", value = CompteCourant.class), @Type(name = "CE", value = CompteEpargne.class) })
//Gestion de SOAP via xml ( equivalent à json )
@XmlSeeAlso({ CompteCourant.class, CompteEpargne.class })
public abstract class Compte implements Serializable {

	@Id
	private String codeCompte;

	private Date dateCreation;
	private double solde;

	// Un compte appartient à un seul client ( association bidirectonnel )
	@ManyToOne
	@JoinColumn(name = "CODE_CLIENT") // CODE_CLIENT = foreignkey
	private Client client;

	// Une compte est creer par un seul employe ( association bidrectionnel )
	@ManyToOne
	@JoinColumn(name = "CODE_EMPLOYE") // CODE_EMPLOYE = foreignkey
	private Employe employe;

	// Un compte peut subir plusieur operations ( association unidirectionnel )
	@OneToMany(mappedBy = "compte")
	private Collection<Operation> operations;

	public String getCodeCompte() {
		return codeCompte;
	}

	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@JsonIgnore
	@XmlTransient
	public Collection<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}

	// Ne pas inclure les attributs d'association. "client","employe","operations"
	public Compte(String codeCompte, Date dateCreation, double solde) {
		super();
		this.codeCompte = codeCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

}
