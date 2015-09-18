package com.cmproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="aluguel")
public class Aluguel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_aluguel")
	private long idAluguel;
	@OneToOne
	@JoinColumn(name="id_Veiculo", nullable = false)
	private Veiculo veiculo;
	@ManyToOne
	@JoinColumn(name="id_visitante", nullable = false)
	private Usuario visitante;
	@Column(nullable = false)
	private String retirada;
	@Column(nullable = false)
	private String entrega;
	
	
	public long getId_aluguel() {
		return idAluguel;
	}
	public void setId_aluguel(long idAluguel) {
		this.idAluguel = idAluguel;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Usuario getVisitante() {
		return visitante;
	}
	public void setVisitante(Usuario visitante) {
		this.visitante = visitante;
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
