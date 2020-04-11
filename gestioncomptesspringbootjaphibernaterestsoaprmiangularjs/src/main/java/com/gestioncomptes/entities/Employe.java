package com.gestioncomptes.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Employe implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeEmploye;
	private String nomEmploye;

	// Association reflexive
	// 1 employé à 0 ou 1 chef superieur
	@ManyToOne
	@JoinColumn(name = "CODE_EMPLOYE_SUPERIEUR")
	private Employe employeSuperieur;

	@ManyToMany
	@JoinTable(name = "EMPOYE_GROUPE") // table de joindre
	private Collection<Groupe> groupes;

	// Ne pas inclure les attributs d'association. "employeSuperieur","groupes"
	public Employe(String nomEmploye) {
		super();
		this.nomEmploye = nomEmploye;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCodeEmploye() {
		return codeEmploye;
	}

	public void setCodeEmploye(Long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	@JsonIgnore // ne renvoi pas le résultat aux request get ...
	@XmlTransient
	public Employe getEmployeSuperieur() {
		return employeSuperieur;
	}

	@JsonSetter // autorise les updates depuis les request post sous form json
	public void setEmployeSuperieur(Employe employeSuperieur) {
		this.employeSuperieur = employeSuperieur;
	}

	@JsonIgnore
	@XmlTransient
	public Collection<Groupe> getGroupes() {
		return groupes;
	}

	@JsonSetter // autorise les updates depuis les request post sous form json
	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}

}
