package com.cmproject.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cmproject.model.Usuario;
import com.cmproject.regradenegocio.UsuarioRN;

@ManagedBean (name="usuarioMB")
@SessionScoped
public class UsuarioMB {

	private boolean loggedIn;

	private Usuario usuario = new Usuario();
	
	private Usuario usuarioLogado = new Usuario();

	public void salvar(){
		UsuarioRN usuarioRN = new UsuarioRN();
		if(usuarioRN.pesquisarCPF(usuario.getCpf()) || usuarioRN.pesquisarEmail(usuario.getEmail())){
			FacesMessage mensagem = new FacesMessage("cpf informado já cadastrado.");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
		} else {
			usuarioRN.salvar(usuario);
			FacesMessage mensagem = new FacesMessage("Cadastrado com sucesso!");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
		}
	}

	public String logar(){
		UsuarioRN usuarioRN = new UsuarioRN();
		if(usuarioRN.pesquisarEmail(usuario.getEmail())){
			FacesMessage mensagem = new FacesMessage("Usuário logado com sucesso!");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
			setLoggedIn(true);
			usuarioLogado = usuario;
			return "/_pages/_other/nossos_veiculos.xhtml";
		} else {
			FacesMessage mensagem = new FacesMessage("Você não tem cadastrado");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
			return "";
		}
	}

	public List<Usuario> listar(){
		UsuarioRN usuarioRN = new UsuarioRN();
		return usuarioRN.listarUsuario();
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
}






