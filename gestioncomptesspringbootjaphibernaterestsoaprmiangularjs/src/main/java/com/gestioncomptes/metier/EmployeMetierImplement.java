package com.gestioncomptes.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestioncomptes.dao.IEmployeRepository;
import com.gestioncomptes.entities.Employe;

@Service
public class EmployeMetierImplement implements IEmployeMetier {

	@Autowired
	private IEmployeRepository employeRepository;

	@Override
	public Employe saveEmploye(Employe employe) {
		return employeRepository.save(employe);
	}

	@Override
	public List<Employe> listemployes() {
		return employeRepository.findAll();
	}

}
