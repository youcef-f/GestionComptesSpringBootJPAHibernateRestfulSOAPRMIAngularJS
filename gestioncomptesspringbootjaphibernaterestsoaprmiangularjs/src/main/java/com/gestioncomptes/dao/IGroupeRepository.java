package com.gestioncomptes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gestioncomptes.entities.Groupe;

@RepositoryRestResource
public interface IGroupeRepository extends JpaRepository<Groupe, Long> {

}
