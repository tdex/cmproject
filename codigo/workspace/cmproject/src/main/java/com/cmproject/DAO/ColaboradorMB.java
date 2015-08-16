package com.cmproject.DAO;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.cmproject.model.Colaborador;
import com.cmproject.model.TipoAcessoENUM;

@ManagedBean
@SessionScoped
public class ColaboradorMB implements ColaboradorDAO, Serializable{

	private static final long serialVersionUID = 1L;

	private Colaborador colaborador;
	
	public ColaboradorMB(){
		this.colaborador = new Colaborador();
	}
	
//CRUD
	
	@Override
	public void save(Colaborador colaborador) {
		
	}

	@Override
	public Colaborador getColaborador(long id) {
		return null;
	}

	@Override
	public List<Colaborador> list() {
		return null;
	}

	@Override
	public void remove(Colaborador colaborador) {
		
	}

	@Override
	public void update(Colaborador colaborador) {
		
	}

//getter e setter
	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public List<TipoAcessoENUM> getTipoAcesso(){
		return Arrays.asList(TipoAcessoENUM.values());
	}
	
	

}
