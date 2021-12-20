package com.testebackend.calculorentabilidade.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testebackend.calculorentabilidade.models.CalculoRentabilidade;
import com.testebackend.calculorentabilidade.models.Investimento;
import com.testebackend.calculorentabilidade.repository.CalculoRentabilidadeRepository;
import com.testebackend.calculorentabilidade.repository.InvestimentoRepository;
import com.testebackend.calculorentabilidade.service.InvestimentoService;

@RestController
@RequestMapping(value = "/api-investimento")
public class InvestimentoController {

	@Autowired
	InvestimentoRepository investimentoRepository;
	
	@Autowired
	CalculoRentabilidadeRepository calculoRentabilidadeRepository;
	
	@Autowired
	InvestimentoService investimentoService;
	
	@GetMapping("/investimentos")
	public List<CalculoRentabilidade> listaInvestimentos() {
		return calculoRentabilidadeRepository.findAll();
	}
	
	@GetMapping("/investimento/{id}")
	public Investimento listaInvestimento(@PathVariable(value="id") long id) {
		return investimentoRepository.findById(id);
	}
	
	@PostMapping("/investimento")
	public CalculoRentabilidade salvaInvestimento(@RequestBody Investimento investimento) {
		return investimentoService.calcularRentabilidade(investimento);
	}
	
	@PutMapping("/investimento")
	public Investimento atualizaInvestimento(@RequestBody Investimento investimento) {
		return investimentoRepository.save(investimento);
	}
	
	@DeleteMapping("/investimento")
	public void deletaInvestimento(@RequestBody Investimento investimento) {
		investimentoRepository.delete(investimento);
	}
}
