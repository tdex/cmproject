package com.cmproject.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cmproject.model.Visitante;
import com.cmproject.regradenegocio.VisitanteRN;
import com.mysql.jdbc.TimeUtil;

@ManagedBean (name="visitanteMB")
@SessionScoped
public class VisitanteMB {

	private boolean loggedIn;

	private Visitante visitante = new Visitante();
	
	private Visitante visitanteLogado = new Visitante();

	public void salvar(){
		VisitanteRN visitanteRN = new VisitanteRN();
		if(visitanteRN.pesquisarCPF(visitante.getCpf()) || visitanteRN.pesquisarEmail(visitante.getEmail())){
			FacesMessage mensagem = new FacesMessage("cpf informado já cadastrado.");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
		} else {
			visitanteRN.salvar(visitante);
			FacesMessage mensagem = new FacesMessage("Cadastrado com sucesso!");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
		}
	}

	public String logar(){
		VisitanteRN visitanteRN = new VisitanteRN();
		if(visitanteRN.pesquisarEmail(visitante.getEmail())){
			FacesMessage mensagem = new FacesMessage("Usuário logado com sucesso!");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
			setLoggedIn(true);
			visitanteLogado = visitante;
			return "/_pages/_other/nossos_veiculos.xhtml";
		} else {
			FacesMessage mensagem = new FacesMessage("Você não tem cadastrado");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
			return "";
		}
	}

	public List<Visitante> listar(){
		VisitanteRN visitanteRN = new VisitanteRN();
		return visitanteRN.listar_visitantes();
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	public Visitante getVisitante() {
		return visitante;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
}






