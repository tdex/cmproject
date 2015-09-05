package com.cmproject.controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cmproject.model.StatusENUM;
import com.cmproject.model.TipoVeiculoENUM;
import com.cmproject.model.Veiculo;
import com.cmproject.regradenegocio.VeiculoNR;

@ManagedBean (name="veiculoMB")
@SessionScoped
public class VeiculoMB{

	private Veiculo veiculo = new Veiculo();
	
	public void salvar(){
		VeiculoNR veiculoNR = new VeiculoNR();
		veiculoNR.salvar(veiculo);
		FacesMessage mensagem = new FacesMessage("Cadastrado com sucesso!");
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, mensagem);
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<TipoVeiculoENUM> getTipoVeiculo(){
		return Arrays.asList(TipoVeiculoENUM.values());
	}

	public List<StatusENUM> getStatusVeiculo(){
		return Arrays.asList(StatusENUM.values());
	}
	
}
