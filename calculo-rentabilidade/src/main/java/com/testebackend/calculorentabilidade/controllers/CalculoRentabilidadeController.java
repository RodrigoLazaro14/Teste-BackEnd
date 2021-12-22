package com.testebackend.calculorentabilidade.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping(value = "/api-calculo-rentabilidade")
@CrossOrigin(origins="*", allowedHeaders="*")
public class CalculoRentabilidadeController {

	@Autowired
	InvestimentoRepository investimentoRepository;
	
	@Autowired
	CalculoRentabilidadeRepository calculoRentabilidadeRepository;
	
	@Autowired
	InvestimentoService investimentoService;
	
	
	@PostMapping("/investimento")
	public CalculoRentabilidade salvaInvestimento(@RequestBody Investimento investimento) {
		return investimentoService.calcularRentabilidade(investimento);
	}
	
	@GetMapping("/investimentos")
	public List<CalculoRentabilidade> getListaInvestimentos() {
		return calculoRentabilidadeRepository.findAll();
	}
	
	@GetMapping("/investimento/{name}")
	public ResponseEntity<List<CalculoRentabilidade>> getInvestimentoByName(@PathVariable String name) {
		return ResponseEntity.ok(calculoRentabilidadeRepository.findBynomeUsuarioContainingIgnoreCase(name));
	}
	
	@PutMapping("/investimento")
	public CalculoRentabilidade atualizaInvestimento(@RequestBody CalculoRentabilidade investimento) {
		return calculoRentabilidadeRepository.save(investimento);
	}
	
	@DeleteMapping("/investimento")
	public void deletaInvestimento(@RequestBody CalculoRentabilidade investimento) {
		calculoRentabilidadeRepository.delete(investimento);
	}

}
