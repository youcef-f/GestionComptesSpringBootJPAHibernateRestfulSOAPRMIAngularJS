package com.gestioncomptes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestioncomptes.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {

}
