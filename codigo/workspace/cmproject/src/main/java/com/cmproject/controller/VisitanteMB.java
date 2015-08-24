package com.cmproject.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cmproject.model.Visitante;

@ManagedBean
@SessionScoped
public class VisitanteMB {

	private Visitante visitante;
	
	

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}



}
