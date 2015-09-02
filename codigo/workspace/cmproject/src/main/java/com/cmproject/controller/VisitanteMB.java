package com.cmproject.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cmproject.model.Visitante;
import com.cmproject.regradenegocio.VisitanteRN;

@ManagedBean (name="visitanteMB")
@SessionScoped
public class VisitanteMB {

	private Visitante visitante = new Visitante();
	
	public void salvar(){
		VisitanteRN visitanteRN = new VisitanteRN();
		visitanteRN.salvar(visitante);
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	public Visitante getVisitante() {
		return visitante;
	}
	
	

}
