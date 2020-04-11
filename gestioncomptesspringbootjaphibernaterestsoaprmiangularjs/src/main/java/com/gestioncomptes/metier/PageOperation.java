package com.gestioncomptes.metier;

import java.io.Serializable;
import java.util.List;

import com.gestioncomptes.entities.Operation;

// cette classe est destinée à gerer la présentation au moyen de
// pages et information contenu dans la page
public class PageOperation implements Serializable {

	private List<Operation> operations;

	// meta données de la page
	private int pageCourant;
	private int nombreOperationsInPage;
	private int totalOperations;
	private int totalPages;

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public int getPageCourant() {
		return pageCourant;
	}

	public void setPageCourant(int pageCourant) {
		this.pageCourant = pageCourant;
	}

	public int getNombreOperationsInPage() {
		return nombreOperationsInPage;
	}

	public void setNombreOperationsInPage(int nombreOperationsInPage) {
		this.nombreOperationsInPage = nombreOperationsInPage;
	}

	public int getTotalOperations() {
		return totalOperations;
	}

	public void setTotalOperations(int totalOperations) {
		this.totalOperations = totalOperations;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

}
