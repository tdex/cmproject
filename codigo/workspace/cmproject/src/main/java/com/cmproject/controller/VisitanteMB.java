package com.cmproject.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cmproject.DAO.VisitanteDAO;
import com.cmproject.model.Visitante;

@ManagedBean
@SessionScoped
public class VisitanteMB implements VisitanteDAO{

	private Visitante visitante;
	
	@Override
	public void save(Visitante visitante) {
		// TODO Auto-generated method stub

	}

	@Override
	public Visitante getVisitante(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitante> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Visitante visitante) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Visitante visitante) {
		// TODO Auto-generated method stub

	}


	//getter e setter	

	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}



}
