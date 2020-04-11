package com.gestioncomptes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncomptes.entities.Groupe;

public interface IGroupeRepository extends JpaRepository<Groupe, Long> {

}
