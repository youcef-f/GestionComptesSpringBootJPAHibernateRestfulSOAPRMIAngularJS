package com.gestioncomptes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gestioncomptes.entities.Employe;

@RepositoryRestResource
public interface IEmployeRepository extends JpaRepository<Employe, Long> {

}
