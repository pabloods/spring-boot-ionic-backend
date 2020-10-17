package com.pablo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pablo.domain.Cliente;

	@Repository
	public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
		
	}
	

