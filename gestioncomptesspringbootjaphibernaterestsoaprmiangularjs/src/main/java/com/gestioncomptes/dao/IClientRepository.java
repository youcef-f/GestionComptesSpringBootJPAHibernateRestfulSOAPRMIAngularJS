package com.gestioncomptes.dao;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.gestioncomptes.entities.Client;

@RepositoryRestResource
public interface IClientRepository extends JpaRepository<Client, Long> {

	@RestResource(path="/contient")
	public List<Client> findByNomClientContains(@Param("motcle") String motCle ) ; 
}
