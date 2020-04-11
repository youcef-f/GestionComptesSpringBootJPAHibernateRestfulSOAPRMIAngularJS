package com.gestioncomptes.metier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncomptes.entities.Client;
import com.gestioncomptes.entities.Employe;

public interface IEmployeMetier {

	public Employe saveEmploye(Employe employe);

	public List<Employe> listemployes();

}
