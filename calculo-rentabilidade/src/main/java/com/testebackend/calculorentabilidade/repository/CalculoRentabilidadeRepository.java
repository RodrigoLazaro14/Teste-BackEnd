package com.testebackend.calculorentabilidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testebackend.calculorentabilidade.models.CalculoRentabilidade;

public interface CalculoRentabilidadeRepository extends JpaRepository<CalculoRentabilidade, Long> {

	
	
}
