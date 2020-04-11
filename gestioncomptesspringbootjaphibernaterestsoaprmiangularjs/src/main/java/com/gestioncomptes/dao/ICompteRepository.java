package com.gestioncomptes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncomptes.entities.Compte;

public interface ICompteRepository extends JpaRepository<Compte, String> {

}
