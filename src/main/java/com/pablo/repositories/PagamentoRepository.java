package com.pablo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pablo.domain.Pagamento;

	@Repository
	public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{
		
	}
	

