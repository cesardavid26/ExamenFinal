package com.example.demo.repository;


import com.example.demo.entities.Basico;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BasicoRepository extends JpaRepository <Basico, Integer>{
	@Query("SELECT b FROM Basico b WHERE b.documento = ?1")
    Optional<Basico> findByDocumento(String documento);
}
