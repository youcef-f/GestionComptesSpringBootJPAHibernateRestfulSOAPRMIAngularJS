package com.gestioncomptes.servicesrestful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestioncomptes.entities.Employe;
import com.gestioncomptes.metier.IEmployeMetier;

@RestController
public class EmployeRestService {

	@Autowired
	private IEmployeMetier employeMetier;

	@RequestMapping(value = "/employes", method = RequestMethod.POST)
	// @ResponseBody Par defaut en json
	public Employe saveEmploye(@RequestBody Employe employe) {
		return employeMetier.saveEmploye(employe);
	}

	@RequestMapping(value = "/employes", method = RequestMethod.GET)
	public List<Employe> listemployes() {
		return employeMetier.listemployes();
	}

}
