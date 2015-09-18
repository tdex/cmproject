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
@Table(name="usuario")
public class Usuario {
	
	public Usuario(){
	}
	
	public Usuario(String nome, String telefone, String email, String senha,
			String endereco, String cpf, TipoUsuarioENUM tipoUsuario) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.endereco = endereco;
		this.tipoUsuario = tipoUsuario;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_visitante")
	private long idVisitante; 
	@Column(nullable = false, length = 150)
	private String nome;
	@Column(nullable = false, length = 300)
	private String email;
	@Column(nullable = false, length = 10)
	private String senha;
	@Column(nullable = false, length = 14)
	private String cpf;
	@Column
	private String telefone;
	@Column
	private String endereco;
	@Enumerated(EnumType.ORDINAL)
	private TipoUsuarioENUM tipoUsuario;
	

	public long getId_visitante() {
		return idVisitante;
	}
	public void setidVisitante(long idVisitante) {
		this.idVisitante = idVisitante;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public TipoUsuarioENUM getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuarioENUM tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
