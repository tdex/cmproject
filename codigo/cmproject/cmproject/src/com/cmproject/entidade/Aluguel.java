package com.cmproject.entidade;

public class Aluguel {
	private String id;
	private String idVeiculo;
	private String idVisitante;
	private String dataAluguel;
	
	public String getDataAluguel() {
		return dataAluguel;
	}
	public void setDataAluguel(String string) {
		this.dataAluguel = string;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(String idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public String getIdVisitante() {
		return idVisitante;
	}
	public void setIdVisitante(String idVisitante) {
		this.idVisitante = idVisitante;
	}
	
	
}
