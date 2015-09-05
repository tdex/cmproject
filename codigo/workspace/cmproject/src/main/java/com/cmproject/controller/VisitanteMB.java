package com.cmproject.controller;

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
		visitanteRN.salvar(visitante);
		FacesMessage mensagem = new FacesMessage("Cadastrado com sucesso!");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
		
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	public Visitante getVisitante() {
		return visitante;
	}
	
	

}
