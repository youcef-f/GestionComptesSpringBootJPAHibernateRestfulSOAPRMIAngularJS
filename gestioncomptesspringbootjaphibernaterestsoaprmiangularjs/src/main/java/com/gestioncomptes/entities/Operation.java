package com.gestioncomptes.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length = 1)

//La classe "Operation" est abstraite. Pour etre néanmoins instanciable depuis le resControler par l'api jackson durant
//la methode **post,get...**. Nous devons specifier quelles sont les classes qui en heritent. Ici les Classes "Retrait"
//et "Versement" herites de cette classes.Pour les distingués, on demande à json de regarder la proprietés "typeOperationVR"
//lors de la methode poste et affecte respectivement soit "V" et "R" pour les "Versement" et "Retrai<t".
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeOperationVR") // "typeOperationVR"
                                                                                                            // => Ici defini
                                                                                                            // arbitrairement.
@JsonSubTypes({ 
	@Type(name = "V", value = Versement.class), 
	@Type(name = "R", value = Retrait.class)
	})

public class Operation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroOperation;
	private Date dateOperation;
	private double montant;

	// 1 operation est créée par 1 employe. ( association bidirectionnel )
	@ManyToOne
	@JoinColumn(name = "CODE_EMPLOYE") // CODE_EMPLOYE = foreignkey
	private Employe employe;

	// 1 Operation est appliquée sur 1 compte. ( association bidirectionnel )
	@ManyToOne
	@JoinColumn(name = "CODE_COMPTE") // CODE_COMPTE = foreignkey
	private Compte compte;

	public Long getNumeroOperation() {
		return numeroOperation;
	}

	public void setNumeroOperation(Long numeroOperation) {
		this.numeroOperation = numeroOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@JsonIgnore
	@XmlTransient
	public Employe getEmploye() {
		return employe;
	}

	// @JsonSetter
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@JsonIgnore
	@XmlTransient
	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Ne pas inclure les attributs d'association. "employe","compte"
	public Operation(Long numeroOperation, Date dateOperation, double montant) {
		super();
		this.numeroOperation = numeroOperation;
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

}
