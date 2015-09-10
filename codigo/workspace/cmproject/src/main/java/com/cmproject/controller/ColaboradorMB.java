package com.cmproject.controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cmproject.model.Colaborador;
import com.cmproject.model.TipoAcessoENUM;
import com.cmproject.regradenegocio.ColaboradorRN;

@ManagedBean (name="colaboradorMB")
@SessionScoped
public class ColaboradorMB {

	private Colaborador colaborador = new Colaborador();
	
	public void salvar(){
		ColaboradorRN colaboradorRN = new ColaboradorRN();
		colaboradorRN.salvar(colaborador);
		FacesMessage mensagem = new FacesMessage("Colaborador cadastrado com sucesso!");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
	
	}
	
	public List<Colaborador> listar(){
		ColaboradorRN colaboradorRN = new ColaboradorRN();
		return colaboradorRN.listar_colaboradores();
	}
	
	//getter e setter
	public List<TipoAcessoENUM> getTipoAcesso(){
		return Arrays.asList(TipoAcessoENUM.values());
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

}
