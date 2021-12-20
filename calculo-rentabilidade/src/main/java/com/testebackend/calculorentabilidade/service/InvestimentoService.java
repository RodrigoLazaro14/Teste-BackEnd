package com.testebackend.calculorentabilidade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testebackend.calculorentabilidade.models.CalculoRentabilidade;
import com.testebackend.calculorentabilidade.models.Investimento;
import com.testebackend.calculorentabilidade.repository.InvestimentoRepository;

@Service
public class InvestimentoService {

	@Autowired
	private InvestimentoRepository investimentoRepository;
	
	CalculoRentabilidade calculoRentabilidade = new CalculoRentabilidade();
	
	public CalculoRentabilidade calcularRentabilidade(Investimento investimento) {
		
		double investimentoInicial;
		double taxaSelicAno;
		double base;
		double potencia;
		double tempoInvestimento;
		double resultado;
		
		investimentoInicial = (investimento.getInvestimentoSemanal() == 0 ? investimento.getInvestimentoInicial() : investimento.getInvestimentoSemanal() * investimento.getPrazo());
		taxaSelicAno = investimento.getTaxaSelicAno()/100;
		
		calculoRentabilidade.setNomeUsuario(investimento.getNomeUsuario());
		calculoRentabilidade.setInvestimentoInicial(investimentoInicial);
		calculoRentabilidade.setInvestimentoSemanal(investimento.getInvestimentoSemanal());
		calculoRentabilidade.setTaxaSelicAno(taxaSelicAno);
		calculoRentabilidade.setPrazo(investimento.getPrazo());

		tempoInvestimento = ((investimento.getPrazo()*5));
		resultado = tempoInvestimento/252;
		
		calculoRentabilidade.setTempoInvestimento(resultado);
		
		base = 1 + calculoRentabilidade.getTaxaSelicAno();
		potencia = Math.pow(base, calculoRentabilidade.getTempoInvestimento());
		
		
		calculoRentabilidade.setMontanteFinal(calculoRentabilidade.getInvestimentoInicial()*potencia);
		
		return investimentoRepository.save(calculoRentabilidade);
	}
	
}
