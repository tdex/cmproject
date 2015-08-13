package com.cmproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_veiculo;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String modelo;
	@Column
	private String imagem;
	@Column
	@Enumerated(EnumType.ORDINAL)
	private TipoVeiculoENUM tipo;
	@Column(nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private StatusENUM status; //disponivel ou não
	@Column(nullable = false, length = 600)
	private String descricao;
	
	

	public long getId_veiculo() {
		return id_veiculo;
	}
	public void setId_veiculo(long id_veiculo) {
		this.id_veiculo = id_veiculo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public TipoVeiculoENUM getTipo() {
		return tipo;
	}
	public void setTipo(TipoVeiculoENUM tipo) {
		this.tipo = tipo;
	}
	public StatusENUM getStatus() {
		return status;
	}
	public void setStatus(StatusENUM status) {
		this.status = status;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
