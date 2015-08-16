package com.cmproject.DAO;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cmproject.model.Visitante;

@ManagedBean
@SessionScoped
public class VisitanteMB implements VisitanteDAO, Serializable{

	private static final long serialVersionUID = 1L;
	
	private Visitante visitante;

	public VisitanteMB() {
		this.visitante = new Visitante();
	}
	
//CRUD
	
	@Override
	public void save(Visitante visitante) {
		
	}

	@Override
	public Visitante getVisitante(long id) {
		return null;
	}

	@Override
	public List<Visitante> list() {
		return null;
	}

	@Override
	public void remove(Visitante visitante) {
		
	}

	@Override
	public void update(Visitante visitante) {
		
	}
	
//getter e setter	

	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}



	
}
