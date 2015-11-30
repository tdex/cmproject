package com.cmproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="veiculo")
public class Veiculo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_veiculo")
	private long idVeiculo;
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
	@Column
	private String dataInicio;
	@Column
	private String dataFinal;
	@Column
	private long valor;
	@Column
	private long valorPromocao;
	
	public long getId_veiculo() {
		return idVeiculo;
	}
	public void setId_veiculo(long idVeiculo) {
		this.idVeiculo = idVeiculo;
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
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public long getValorPromocao() {
		return valorPromocao;
	}
	public void setValorPromocao(long valorPromocao) {
		this.valorPromocao = valorPromocao;
	}
	public void setValor(long valor) {
		this.valor = valor;
	}
	public long getValor() {
		return valor;
	}
}
