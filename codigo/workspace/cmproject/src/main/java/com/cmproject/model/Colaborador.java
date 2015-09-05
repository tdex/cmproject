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
@Table(name="colaborador")
public class Colaborador {
	
	public Colaborador(){
	}
	
	public Colaborador(String nome, String telefone, String cpf, String email,
			String senha, String endereco, TipoAcessoENUM tipoAcesso) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.tipoAcesso = tipoAcesso;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_colaborador")
	private long idColaborador;
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
		return idColaborador;
	}
	public void setId_colaborador(long idColaborador) {
		this.idColaborador = idColaborador;
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
