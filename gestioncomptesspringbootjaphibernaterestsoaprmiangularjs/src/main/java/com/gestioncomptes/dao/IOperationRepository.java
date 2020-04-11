package com.gestioncomptes.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestioncomptes.entities.Compte;
import com.gestioncomptes.entities.Operation;

public interface IOperationRepository extends JpaRepository<Operation, Long> {

	@Query("select o from Operation o where o.compte.codeCompte=:x")
	public Page<Operation> getOperation(@Param("x") String codeCompte, Pageable pageable);

	// public Page<Operation> findByComte(Compte compte, Pageable pageable) ;
}
