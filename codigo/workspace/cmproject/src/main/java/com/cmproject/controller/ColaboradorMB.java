package com.cmproject.controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.cmproject.DAO.ColaboradorDAO;
import com.cmproject.model.Colaborador;
import com.cmproject.model.TipoAcessoENUM;

@ManagedBean
public class ColaboradorMB implements ColaboradorDAO{

	private Colaborador Colaborador;

	@Override
	public void save(Colaborador colaborador) {
		// TODO Auto-generated method stub

	}

	@Override
	public Colaborador getColaborador(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Colaborador> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Colaborador colaborador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Colaborador colaborador) {
		// TODO Auto-generated method stub

	}



	//getter e setter
	

	public List<TipoAcessoENUM> getTipoAcesso(){
		return Arrays.asList(TipoAcessoENUM.values());
	}

	public Colaborador getColaborador() {
		return Colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		Colaborador = colaborador;
	}



}
