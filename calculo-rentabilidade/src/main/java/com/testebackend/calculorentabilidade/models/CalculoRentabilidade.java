package com.testebackend.calculorentabilidade.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_calculo_rentabilidade")
public class CalculoRentabilidade extends Investimento {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "montante_final")
	double montanteFinal;
	
	@Column(name = "tempo_investimento")
	private double tempoInvestimento;
	
	
	public double getMontanteFinal() {
		return montanteFinal;
	}
	
	public void setMontanteFinal(double montanteFinal) {
		this.montanteFinal = montanteFinal;
	}
	
	public double getTempoInvestimento() {
		return tempoInvestimento;
	}
	
	public void setTempoInvestimento(double tempoInvestimento) {
		this.tempoInvestimento = tempoInvestimento;
	}

}
