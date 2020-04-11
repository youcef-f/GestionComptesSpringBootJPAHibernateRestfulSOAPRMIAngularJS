package com.gestioncomptes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncomptes.entities.Employe;

public interface IEmployeRepository extends JpaRepository<Employe, Long> {

}
