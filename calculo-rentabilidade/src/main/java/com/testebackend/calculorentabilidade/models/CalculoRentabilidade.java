package com.testebackend.calculorentabilidade.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_calculo_rentabilidade")
public class CalculoRentabilidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id_investimento")
	private long id;
	
	@Column(name = "nome_usuario")
	private String nomeUsuario;
	
	@Column(name = "montante_final")
	private double montante;
	
	@Column(name = "investimento_inicial")
	private double investimentoInicial;
	
	@Column(name = "taxa_selic_ano")
	private double taxaSelicAno;
	
	@Column(name = "tempo_investimento")
	private double tempoInvestimento;
	
	@Column(name = "prazo_investimento")
	private int prazo;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

	public double getInvestimentoInicial() {
		return investimentoInicial;
	}

	public void setInvestimentoInicial(double investimentoInicial) {
		this.investimentoInicial = investimentoInicial;
	}

	public double getTaxaSelicAno() {
		return taxaSelicAno;
	}

	public void setTaxaSelicAno(double taxaSelicAno) {
		this.taxaSelicAno = taxaSelicAno;
	}

	public double getTempoInvestimento() {
		return tempoInvestimento;
	}

	public void setTempoInvestimento(double tempoInvestimento) {
		this.tempoInvestimento = tempoInvestimento;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

}
