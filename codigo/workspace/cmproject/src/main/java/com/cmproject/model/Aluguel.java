package com.cmproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluguel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_aluguel;
	
	@Column(nullable = false)
	private long idVeiculo;
	@Column(nullable = false)
	private long idVisitante;
	@Column(nullable = false)
	private String retirada;
	@Column(nullable = false)
	private String entrega;
	
	
	public long getId_aluguel() {
		return id_aluguel;
	}
	public void setId_aluguel(long id_aluguel) {
		this.id_aluguel = id_aluguel;
	}
	public long getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public long getIdVisitante() {
		return idVisitante;
	}
	public void setIdVisitante(long idVisitante) {
		this.idVisitante = idVisitante;
	}
	public String getRetirada() {
		return retirada;
	}
	public void setRetirada(String retirada) {
		this.retirada = retirada;
	}
	public String getEntrega() {
		return entrega;
	}
	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}
	
	
	
}
