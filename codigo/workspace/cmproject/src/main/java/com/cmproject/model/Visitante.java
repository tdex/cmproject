package com.cmproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_visitante; 
	@Column(nullable = false, length = 150)
	private String nome;
	@Column
	private String telefone;
	@Column(nullable = false, length = 300)
	private String email;
	@Column(nullable = false, length = 10)
	private String senha;
	@Column
	private String endereco;
	

	public long getId_visitante() {
		return id_visitante;
	}
	public void setId_visitante(long id_visitante) {
		this.id_visitante = id_visitante;
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
	
	
}
