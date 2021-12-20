package com.testebackend.calculorentabilidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testebackend.calculorentabilidade.models.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

	Investimento findById(long id);
	
}
