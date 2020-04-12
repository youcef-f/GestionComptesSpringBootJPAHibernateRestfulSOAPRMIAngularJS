package com.gestioncomptes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gestioncomptes.entities.Compte;

@RepositoryRestResource
public interface ICompteRepository extends JpaRepository<Compte, String> {

}
