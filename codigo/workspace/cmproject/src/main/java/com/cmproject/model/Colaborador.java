package com.cmproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Colaborador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_colaborador;
	@Column(nullable = false)
	private String nome;
	@Column
	private String telefone;
	@Column(nullable = false, length = 14)
	private String cpf;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false, length = 10)
	private String senha;
	@Column(nullable = false)
	private String endereco;
	@Enumerated(EnumType.ORDINAL)
	private TipoAcessoENUM tipoAcesso;
	
	
	public long getId_colaborador() {
		return id_colaborador;
	}
	public void setId_colaborador(long id_colaborador) {
		this.id_colaborador = id_colaborador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public TipoAcessoENUM getTipoAcesso() {
		return tipoAcesso;
	}
	public void setTipoAcesso(TipoAcessoENUM tipoAcesso) {
		this.tipoAcesso = tipoAcesso;
	}
	
	
}
