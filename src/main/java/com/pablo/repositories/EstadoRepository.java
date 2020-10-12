package com.pablo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pablo.domain.Estado;

	@Repository
	public interface EstadoRepository extends JpaRepository<Estado, Integer>{ 
		
	}
	

