package com.pablo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pablo.domain.Endereco;

	@Repository
	public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
		
	}
	

