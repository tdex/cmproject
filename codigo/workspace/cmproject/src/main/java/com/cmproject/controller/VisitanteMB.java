package com.cmproject.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cmproject.model.Visitante;
import com.cmproject.regradenegocio.VisitanteRN;

@ManagedBean (name="visitanteMB")
@SessionScoped
public class VisitanteMB {

	private Visitante visitante = new Visitante();
	
	public void salvar(){
		VisitanteRN visitanteRN = new VisitanteRN();
		if(visitanteRN.pesquisarCPF(visitante.getCpf())){
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
	
	public void logar(){
		VisitanteRN visitanteRN = new VisitanteRN();
		if(visitanteRN.pesquisarEmail(visitante.getEmail())){
			FacesMessage mensagem = new FacesMessage("Você tem cadastro");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
		} else {
			FacesMessage mensagem = new FacesMessage("Você não tem cadastrado");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, mensagem);
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
	
}
